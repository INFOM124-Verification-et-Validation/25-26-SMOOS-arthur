package delft;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.within;
import java.time.temporal.ChronoUnit;

import java.util.*;
import java.util.stream.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.time.*;

class AutoAssignerTest {
    private AutoAssigner autoAssigner;

    private ZonedDateTime date(int year, int month, int day, int hour, int minute) {
        return ZonedDateTime.of(year, month, day, hour, minute, 0, 0, ZoneId.systemDefault());
    }
    Map planning = Map.of()




    @Test
    public void testStudent1(){
        Student student1 = new Student(1,"arthur","arthur.com");

        assertEquals(1,student1.getId());
        assertEquals("arthur",student1.getName());
        assertEquals("arthur.com",student1.getEmail());
    }

    @Test
    public void testWorkshop1(){
        Workshop workshop1 = new Workshop(12,"java",);

        assertEquals(12,workshop1.getId());
        assertEquals("java",workshop1.getName());

    }

}
