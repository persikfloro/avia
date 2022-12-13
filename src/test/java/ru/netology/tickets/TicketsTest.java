package ru.netology.tickets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketsTest {
    TicketsRepo repo = new TicketsRepo();
    AviaManager manager = new AviaManager(repo);

    Tickets tkt1 = new Tickets(2, "ABZ", "ADL", 2525, 9);
    Tickets tkt2 = new Tickets(5, "ADL", "ABZ", 3000, 12);
    Tickets tkt3 = new Tickets(4, "ABZ", "ADL", 4000, 18);
    Tickets tkt4 = new Tickets(1, "THN", "ADL", 5525, 2);

    @Test
    public void findAFewTickets() {
        manager.addNew(tkt1);
        manager.addNew(tkt2);
        manager.addNew(tkt3);
        manager.addNew(tkt4);

        Tickets[] expected = new Tickets[]{tkt1, tkt3};
        Tickets[] actual = manager.findAll("ABZ", "ADL");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findOneTicket() {
        manager.addNew(tkt1);
        manager.addNew(tkt2);
        manager.addNew(tkt3);
        manager.addNew(tkt4);

        Tickets[] expected = new Tickets[]{tkt4};
        Tickets[] actual = manager.findAll("THN", "ADL");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllTickets() {
        manager.addNew(tkt1);
        manager.addNew(tkt2);
        manager.addNew(tkt3);
        manager.addNew(tkt4);

        Tickets[] expected = new Tickets[]{tkt1, tkt2, tkt3, tkt4};
        Tickets[] actual = manager.findAllTickets();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findNotAddedTicket() {
        manager.addNew(tkt1);
        manager.addNew(tkt2);
        manager.addNew(tkt3);
        manager.addNew(tkt4);

        Tickets[] expected = new Tickets[]{};
        Tickets[] actual = manager.findAll("DMD", "ADC");

        Assertions.assertArrayEquals(expected, actual);
    }

}