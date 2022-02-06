package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {
    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod();
        } catch (FileNotFoundException exception1) {
            throw new IllegalArgumentException("Resource is missing");
        } catch (IOException exception) {
            throw new IllegalArgumentException("Resource error");
        } catch (ArithmeticException exception3) {
            System.out.println("Exception in System.err");
        } catch (NumberFormatException exception4) {
            System.out.println("Exception in System.err");
        }
    }
}
