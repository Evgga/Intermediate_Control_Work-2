package Toys_Shop.core.model;

import Toys_Shop.core.data.ToysDistributor;

import java.util.Scanner;


public class Exit extends Mode {
    public Exit() {
        super("exit", "выход");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        System.out.println("-> выход...");
        System.exit(0);
    }
}
