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

/*
как пользоваться StackTraceElement:
     - создаем стек типа StackTraceElement
StackTraceElement[] ste = Thread.currentThread().getStackTrace();

Имя стека  ste. И заносим в него весь стектрейс (это все, что справа от знака "=")
    - в return вызываем метод getLineNumber() у второго элемента стека.
ste[2].getLineNumber()


В общем-то все)))

Единственное, что нужно отметить это за что отвечают разные элементы стека:
[0] - getStackTrace
[1] - метод где находится данный стектрейс
[2] - метод, вызвавший [1]
...
[x] - последний элемент стека всегда main
 */