package ORG.LEARING.JAVA;

import java.time.LocalDate;

public class Event {
    private String title;
    private LocalDate date = LocalDate.now();

    int chairs;
    int bookedChairs = 0;

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {

        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Inserisci una data corretta.");
        }
        this.date = date;

    }
    public int getChairs() {
        return chairs;
    }
    public int getBookedChairs() {
        return bookedChairs;
    }

    public Event(String title, LocalDate date, int chairs) {
        if (date.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Inserisci una data corretta.");
        }


        if (chairs <= 0) {
            throw new IllegalArgumentException("Il numero di posti deve essere positivo.");
        }
        this.title = title;
        this.date = date;
        this.chairs = chairs;
        this.bookedChairs = 0;
    }
    public void reserve() {

        if (date.isBefore(LocalDate.now())) {
            throw new IllegalStateException("Evento terminato.");
        }


        if (bookedChairs >= chairs) {
            throw new IllegalStateException("Posti terminati.");
        }

        bookedChairs++;
    }
    public void delReserv() {

        if (date.isBefore(LocalDate.now())) {
            throw new IllegalStateException("Evento terminato.");
        }


        if (bookedChairs <= 0) {
            throw new IllegalStateException("Non ci sono prenotazioni.");
        }

        bookedChairs--;
    }

    @Override
    public String toString() {
        return "Event:" + "\n" +
                "title:" + title + "\n" +
                "date:" + date ;
    }
}



