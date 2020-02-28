package com.company;


import java.time.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ZoneId start = ZoneId.of("Europa/London");
        ZonedDateTime zdtStart = ZonedDateTime.now( start );
        ZoneId end = ZoneId.of("Australia/Sidney");
        ZonedDateTime zdtEnd = ZonedDateTime.now(end);
        //Duration timeElapsed = Duration.between(??????);
    }
}


//        Instant instant1 = Clock.system(ZoneId.of("Europe/London")).instant();
//        System.out.println(instant1.toString());
//
//        Instant instant2 = Clock.system(ZoneId.of("Australia/Sidney")).instant();
//        System.out.println(instant2.toString());

//ZonedDateTime start = ZonedDateTime.parse("2020-02-28T23:55:00Z");
//ZonedDateTime end = ZonedDateTime.parse("2020-0301T12:03Z");

//Duration.between(start, end);
//Period.between(start.toLocalDate(), end.toLocalDate());
