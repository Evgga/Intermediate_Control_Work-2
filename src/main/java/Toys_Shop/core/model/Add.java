package Toys_Shop.core.model;

import Toys_Shop.core.data.ToysDistributor;

import java.util.Scanner;


public class Add extends Mode {
    public Add() {
        super("add", "добавить");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        toys.addToy(getToy(toys, scanner, 1));
        System.out.println("-> добавлено успешно");
    }
}
