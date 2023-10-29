package org.example.core.logging;

public class FileLogger implements Logger {

    @Override
    public void log(String data) {
        System.out.println(data + " dosyaya loglandı!");
    }

    @Override
    public void log(int data) {
        System.out.println(data + " dosyaya loglandı!");
    }

    @Override
    public void log(double data) {
        System.out.println(data + " dosyaya loglandı!");
    }
}
