package org.example.workshop;


public interface BaseRepository { /// Sadece imza tutan, implemente edildiğinde imzaların oluşturulması zorunlu kılan arayüzdür.
    void add();
    void update();
    void delete();
}
