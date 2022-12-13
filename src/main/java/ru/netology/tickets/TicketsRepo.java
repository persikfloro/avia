package ru.netology.tickets;
public class TicketsRepo { // добавить, удалить, получить набор билетов

    private Tickets[] tickets = new Tickets[0];

    // добавить билет
    public void add(Tickets ticket) {
        Tickets[] tmp = new Tickets[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tickets.length] = ticket;
        tickets = tmp;
    }


    // удалить билет по id
    public void removeById(int id) {
        Tickets[] tmp = new Tickets[tickets.length - 1];
        int copyToIndex = 0;
        for (Tickets ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[copyToIndex] = ticket;
                copyToIndex++;
            }
        }
        tickets = tmp;
    }

    // получить набор билетов
    public Tickets[] findAll() {
        return tickets;
    }

}
