// Метод должен вернуть номер строки кода, из которого вызвали этот метод.
// Method returns the line number, where it was called.

package com.ExceptionsThredTrace;

public class ThreadTrace {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1() {
        method2();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
    }

    public static void method2() {
        method3();

        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElements[2].getLineNumber());
    }

    public static int method3() {
        method4();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  stackTraceElements[2].getLineNumber();
    }

    public static int method4() {
        method5();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getLineNumber();
    }

    public static int method5() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return stackTraceElements[2].getLineNumber();
    }
}
