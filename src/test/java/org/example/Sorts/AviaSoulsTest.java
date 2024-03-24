package org.example.Sorts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void TestSortThreeTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "MSK", 200, 10, 12);
        Ticket ticket2 = new Ticket("SPb", "MSK", 100, 13, 14);
        Ticket ticket3 = new Ticket("SPb", "Sochi", 300, 9, 12);
        Ticket ticket4 = new Ticket("UFA", "MSK", 400, 20, 12);
        Ticket ticket5 = new Ticket("RIM", "MILAN", 800, 19, 22);
        Ticket ticket6 = new Ticket("SPb", "MSK", 500, 18, 19);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);

        Ticket[] actual = aviaSouls.search("SPb", "MSK");
        Ticket[] expected = {ticket2, ticket1, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestSortZeroTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "MSK", 200, 10, 12);
        Ticket ticket2 = new Ticket("SPb", "MSK", 100, 13, 14);
        Ticket ticket3 = new Ticket("SPb", "Sochi", 300, 9, 12);
        Ticket ticket4 = new Ticket("UFA", "MSK", 400, 20, 12);
        Ticket ticket5 = new Ticket("RIM", "MILAN", 800, 19, 22);
        Ticket ticket6 = new Ticket("SPb", "MSK", 500, 18, 19);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);

        Ticket[] actual = aviaSouls.search("UFA", "MILAN");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestSortOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "MSK", 200, 10, 12);
        Ticket ticket2 = new Ticket("SPb", "MSK", 100, 13, 14);
        Ticket ticket3 = new Ticket("SPb", "Sochi", 300, 9, 12);
        Ticket ticket4 = new Ticket("UFA", "MSK", 400, 20, 12);
        Ticket ticket5 = new Ticket("RIM", "MILAN", 800, 19, 22);
        Ticket ticket6 = new Ticket("SPb", "MSK", 500, 18, 19);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);

        Ticket[] actual = aviaSouls.search("RIM", "MILAN");
        Ticket[] expected = {ticket5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestSpeedSortThreeTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "MSK", 200, 10, 12);
        Ticket ticket2 = new Ticket("SPb", "MSK", 100, 13, 16);
        Ticket ticket3 = new Ticket("SPb", "Sochi", 300, 9, 12);
        Ticket ticket4 = new Ticket("UFA", "MSK", 400, 10, 12);
        Ticket ticket5 = new Ticket("RIM", "MILAN", 800, 19, 22);
        Ticket ticket6 = new Ticket("SPb", "MSK", 500, 18, 19);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = aviaSouls.searchAndSortBy("SPb", "MSK", comparator);
        Ticket[] expected = {ticket6, ticket1, ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TestTimePlusOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "MSK", 200, 10, 12);
        Ticket ticket2 = new Ticket("SPb", "MSK", 100, 13, 16);
        Ticket ticket3 = new Ticket("SPb", "Sochi", 300, 9, 12);
        Ticket ticket4 = new Ticket("UFA", "MSK", 400, 10, 12);
        Ticket ticket5 = new Ticket("RIM", "MILAN", 800, 19, 22);
        Ticket ticket6 = new Ticket("SPb", "MSK", 500, 18, 19);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        TicketTimeComparator comparator = new TicketTimeComparator();


        int actual = ticket1.compareTo(ticket2);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestTimeMinusOneTicket() {
        AviaSouls aviaSouls = new AviaSouls();
        Ticket ticket1 = new Ticket("SPb", "MSK", 200, 10, 12);
        Ticket ticket2 = new Ticket("SPb", "MSK", 100, 13, 16);
        Ticket ticket3 = new Ticket("SPb", "Sochi", 300, 9, 12);
        Ticket ticket4 = new Ticket("UFA", "MSK", 400, 10, 12);
        Ticket ticket5 = new Ticket("RIM", "MILAN", 800, 19, 22);
        Ticket ticket6 = new Ticket("SPb", "MSK", 500, 18, 19);

        aviaSouls.add(ticket1);
        aviaSouls.add(ticket2);
        aviaSouls.add(ticket3);
        aviaSouls.add(ticket4);
        aviaSouls.add(ticket5);
        aviaSouls.add(ticket6);
        TicketTimeComparator comparator = new TicketTimeComparator();


        int actual = ticket3.compareTo(ticket4);
        int expected = -1;

        Assertions.assertEquals(expected, actual);
    }


}
