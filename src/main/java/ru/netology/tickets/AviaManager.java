package ru.netology.tickets;

public class AviaManager {
    TicketsRepo repo;

    public AviaManager(TicketsRepo repo) {
        this.repo = repo;
    }

    public void addNew(Tickets tickets) {
        repo.add(tickets);

    }

    public boolean matches(Tickets ticket, String from, String to) {
        if (ticket.getTo().equals(to)) {
            if (ticket.getFrom().equals(from)) {
                return true;
            }
        }
        return false;
    }

    public Tickets[] findAll(String from, String to) {
        Tickets[] result = new Tickets[0];
        for (Tickets ticket : repo.findAll()) {
            if (matches(ticket, from, to)) {
                Tickets[] tmp = new Tickets[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        return result;
    }

    public Tickets[] findAllTickets() {
        Tickets[] result = repo.findAll();
        return result;
    }
}
