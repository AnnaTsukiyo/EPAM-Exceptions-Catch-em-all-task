package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {
    static Exception exception = new FileNotFoundException();
    static Exception exception2 = new IllegalArgumentException();
    static Exception exception3 = new IOException();

    public static void riskyMethod() throws IllegalArgumentException, IOException {
        throw new IllegalArgumentException();
    }
    //
//Какое исключение брошено?	Как с ним обращаться?
//    IOException	Обернуть в IllegalArgumentException с сообщением "Resource error" и выбросить
//    FileNotFoundException	Обернуть в IllegalArgumentException с сообщением "Resource is missing" и выбросить
//    ArithmeticException or NumberFormatException	Печатать сообщение о сгенерированном исключении в System.err. Ничего не генерировать
//    Любое другое исключение	Не перехватывать
    public static void main(String[] args) throws FileNotFoundException, IOException,IllegalArgumentException {
        try {
            riskyMethod();
        } catch (FileNotFoundException exception1){
            throw  new IllegalArgumentException("Resource is missing");
        } catch (IOException exception){
            throw new IllegalArgumentException("Resource error");
        } catch (ArithmeticException | NumberFormatException exception3){
            exception3.printStackTrace();
        }
    }
}