import invoker.Invoker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Final {

    public static void main(String[] args) throws IOException {
        Invoker invoker = new Invoker();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        System.out.println(sayHello());

        while (true) {
            System.out.print(">>> ");
            String userCommand = br.readLine();

            if (!invoker.invoke(userCommand)) {
                System.out.println("Just do it! :(\n" +
                        "Try to use 'help'");
            }
        }
    }

    static String sayHello() {
        return ("Hello, I'm so kind program. My name's Bob.\n" +
                "I can't do a lot of things, but I can do some cool things!\n" +
                "Interested? Write 'help' and go!\n");
    }
}
