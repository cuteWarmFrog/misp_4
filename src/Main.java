package com.company;

import com.company.invoker.Invoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Привет, я добрая программа. Меня зовут Боб.\n" +
                "Я умею не многое, зато здорово!\n" +
                "Интересно? Пиши 'help' и впередь!\n");
        while (true) {
            System.out.print(">>> ");
            String userCommand = br.readLine();

            if (!invoker.invoke(userCommand)) {
                System.out.println("Сам это делай! :(\n" +
                        "Попробуй вызвать 'help'");
            }
        }
    }
}
