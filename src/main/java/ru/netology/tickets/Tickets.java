package ru.netology.tickets;

public class Tickets implements Comparable<Tickets> {
    protected int id;
    protected String from; // аэропорт вылета
    protected String to; // аэропорт прилета
    protected int price;
    protected int time;

    public Tickets(int id, String from, String to, int price, int time) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
        this.time = time;
    }

    // ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // FROM
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    // TO
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    // PRICE
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // TIME
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    @Override
    public int compareTo(Tickets o) {
        if (this.price > o.getPrice()) {
            return 1;
        } else if (this.price < o.getPrice()) {
            return -1;
        } else {
            return 0;
        }
    }
}
