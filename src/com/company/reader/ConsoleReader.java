package com.company.reader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    private final BufferedReader br;

    public ConsoleReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public String read() throws IOException {
        return br.readLine();
    }
}
