package ORG.LEARING.JAVA;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concert extends Event {
    private LocalTime hour;
    private BigDecimal price;

    public Concert(String title, LocalDate date,int chairs, LocalTime hour, BigDecimal price) {
        super(title, date, chairs);
        this.hour = hour;
        this.price = price;
    }

    public LocalTime getHour() {
        return hour;
    }

    public void setHour(LocalTime hour) {
        this.hour = hour;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDateForm() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return getDate().format(formatter);
    }

    public String getHourForm() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        return hour.format(formatter);
    }

    public String getPriceForm() {
        return price.toString() + "€";
    }

    @Override
    public String toString() {
        return getDateForm() + " - " + getHourForm() + " - " + getTitle() + " - " + getPriceForm();
    }
}