package TicketManager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void compareToTicketOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 7);
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10);
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        System.out.println(ticket4.compareTo(ticket2));

    }

    @Test
    public void compareToTicketNull() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 7);
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10);
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        System.out.println(ticket1.compareTo(ticket3));

    }

    @Test
    public void compareToTicketMinOne() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 7);
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10);
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        System.out.println(ticket1.compareTo(ticket5));

    }

        @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 7);
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10);
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};
        Ticket[] actual = manager.search("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsEmpty() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 7);
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10);
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {};
        Ticket[] actual = manager.search("MSK", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsOneTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 7);
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10);
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);

        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.search("NEW", "LA");

        Assertions.assertArrayEquals(expected, actual);
    }

        @Test
    public void testSortTicketsWithComparator() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12); //2
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14); //3
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 17); //10
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10); //4
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8); //1
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket8, ticket1, ticket2, ticket6, ticket4};
        Ticket[] actual = manager.search("MSK", "SPB", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWithComparatorEmpty() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12); //2
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14); //3
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 17); //10
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10); //4
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8); //1
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.search("MSK", "LA", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTicketsWithComparatorOneTicket() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12); //2
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14); //3
        Ticket ticket3 = new Ticket("MSK", "UFA", 200, 10, 16);
        Ticket ticket4 = new Ticket("MSK", "SPB", 400, 7, 17); //10
        Ticket ticket5 = new Ticket("UFA", "SPB", 800, 4, 9);
        Ticket ticket6 = new Ticket("MSK", "SPB", 200, 6, 10); //4
        Ticket ticket7 = new Ticket("NEW", "LA", 300, 15, 18);
        Ticket ticket8 = new Ticket("MSK", "SPB", 500, 7, 8); //1
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket7};
        Ticket[] actual = manager.search("NEW", "LA", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }


}