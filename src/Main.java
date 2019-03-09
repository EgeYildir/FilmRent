public class Main {
    public static void main(String[] args) {
        Film titanic = new Film("Titanic", "James Cameron", "Drama", 10, 7.8,1998,3,15);
        Film endersGame = new Film("Ender's Game","Gavin Hood","Science Fiction",6,6.7,2013,1,54);
        titanic.rent(3);
        titanic.turnIn(2);
        System.out.println(Shop.getIncome());
    }
}
