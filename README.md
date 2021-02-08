# Catch'em all

Handle a call to a risky method in the main method in [CatchEmAll](src/main/java/com/rpam/rd/autotasks/CatchEmAll.java) that can throw different types of exceptions.

Some types of exceptions should be handled, some other - wrapped and rethrown, some should just be not handled.

Details:

| What is thrown | How to handle |
| --- | --- |
| FileNotFoundException | Wrap in an IllegalArgumentException with a message "Resource is missing" and throw it | 
| IOException | Wrap in an IllegalArgumentException with a message "Resource error" and throw it |
| ArithmeticException or NumberFormatException | Print a message of the thrown exception to System.err and do not throw anything |
| Any other Exceptions | Should not be caught |
