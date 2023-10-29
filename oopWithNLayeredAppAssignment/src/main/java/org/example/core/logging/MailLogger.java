package org.example.core.logging;

public class MailLogger implements Logger{

    @Override
    public void log(String data) {
        System.out.println(data + " mail olarak gönderildi!");
    }

    @Override
    public void log(int data) {

    }

    @Override
    public void log(double data) {

    }
}
