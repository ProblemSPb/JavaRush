//Напиши код, чтобы получить стек-трейс длиной 10 вызовов.

package com.ExceptionsThredTrace;

public class StackTraceLength {

    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {

        return method2();
    }

    public static StackTraceElement[] method2() {
        //напишите тут ваш код
        return method3();
    }

    public static StackTraceElement[] method3() {
        //напишите тут ваш код
        return method4();
    }

    public static StackTraceElement[] method4() {
        //напишите тут ваш код
        return method5();
    }

    public static StackTraceElement[] method5() {
        //напишите тут ваш код
        return method6();
    }

    public static StackTraceElement[] method6() {
        //напишите тут ваш код
        return method7();
    }

    public static StackTraceElement[] method7() {
        //напишите тут ваш код
        return method8();
    }

    public static StackTraceElement[] method8() {
        //напишите тут ваш код
        return method9();
    }

    public static StackTraceElement[] method9() {

        return method10();
    }

    public static StackTraceElement[] method10() {
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace();
    }
}

/*
вот описание методов на полупереведеннорусском
http://spec-zone.ru/RU/Java/Docs/7/api/java/lang/StackTraceElement.html

создаем массив методов до ошибки:
StackTraceElement[] stack = Thread.currentThread().getStackTrace();

методы:
stack.length; - так получаем количество методов в массиве

так можем их перебрать
for (StackTraceElement element: stack)
{ System.out.println(element.getMethodName()); }

для инфы: номера методов в стеке
0 - getStackTrace - сам трейсер
1 - имя метода (свое имя)
2 - имя метода кто вызвал [1] - всегда2...
3 - имя метода кто вызвал [2]
4 - и т.д.

stack[2].getMethodName(); - получаем имя вызывающего метода
stack[2].getLineNumber(); - получаем строку в вызвавшем методое
stack[2].getClassName(); - получаем имя класса
 */