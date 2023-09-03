import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {
    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                20_000,
                9,
                17
        );

        Ticket ticket2 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                25_000,
                10,
                18
        );

        Ticket ticket3 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                15_000,
                22,
                6
        );
        Ticket ticket4 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                30_000,
                8,
                18
        );
        Ticket ticket5 = new Ticket(
                "Санкт-Петербург",
                "Ереван",
                8_000,
                15,
                23
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.search("Санкт-Петербург", "Барнаул");
        Ticket[] expected = {ticket3, ticket1, ticket2};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortTickets2() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                20_000,
                9,
                17
        );

        Ticket ticket2 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                25_000,
                10,
                18
        );

        Ticket ticket3 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                15_000,
                22,
                6
        );
        Ticket ticket4 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                30_000,
                8,
                18
        );
        Ticket ticket5 = new Ticket(
                "Санкт-Петербург",
                "Ереван",
                8_000,
                15,
                23
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.search("Санкт-Петербург", "Ереван");
        Ticket[] expected = {ticket5};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortTickets3() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                20_000,
                9,
                17
        );

        Ticket ticket2 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                25_000,
                10,
                18
        );

        Ticket ticket3 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                15_000,
                22,
                6
        );
        Ticket ticket4 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                30_000,
                8,
                18
        );
        Ticket ticket5 = new Ticket(
                "Санкт-Петербург",
                "Ереван",
                8_000,
                15,
                23
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.search("Стамбул", "Берлин");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortTicketsComparator() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                20_000,
                9,
                17
        );

        Ticket ticket2 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                25_000,
                10,
                18
        );

        Ticket ticket3 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                5_000,
                10,
                11
        );
        Ticket ticket4 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                30_000,
                8,
                18
        );
        Ticket ticket5 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                38_000,
                15,
                23
        );
        Ticket ticket6 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                40_000,
                12,
                18
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Санкт-Петербург", "Алматы", comparator);
        Ticket[] expected = {ticket6, ticket5, ticket4};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortTicketsComparator2() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                20_000,
                9,
                17
        );

        Ticket ticket2 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                5_000,
                10,
                11
        );

        Ticket ticket3 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                15_000,
                22,
                8
        );
        Ticket ticket4 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                30_000,
                8,
                18
        );
        Ticket ticket5 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                38_000,
                15,
                23
        );
        Ticket ticket6 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                40_000,
                12,
                18
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Санкт-Петербург", "Москва", comparator);
        Ticket[] expected = {ticket2};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testSortTicketsComparator3() {
        AviaSouls manager = new AviaSouls();

        Ticket ticket1 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                20_000,
                9,
                17
        );

        Ticket ticket2 = new Ticket(
                "Санкт-Петербург",
                "Москва",
                5_000,
                10,
                11
        );

        Ticket ticket3 = new Ticket(
                "Санкт-Петербург",
                "Барнаул",
                15_000,
                22,
                8
        );
        Ticket ticket4 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                30_000,
                8,
                18
        );
        Ticket ticket5 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                38_000,
                15,
                23
        );
        Ticket ticket6 = new Ticket(
                "Санкт-Петербург",
                "Алматы",
                40_000,
                12,
                18
        );
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("Стамбул", "Германия", comparator);
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

}
