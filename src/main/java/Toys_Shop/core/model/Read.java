package Toys_Shop.core.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import Toys_Shop.core.data.Toy;
import Toys_Shop.core.data.ToysDistributor;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Read extends Mode {
    public Read() {
        super("read", "загрузить из файла");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        System.out.print("Введите имя файла ->");
        String filePath = scanner.next().trim().strip();
        String path = "C:\\Users\\Василий\\Documents\\practicecode\\" +
                "ToyStore_drawing\\src\\main\\resources\\" + filePath + ".json";
        List<Toy> temp;
        ObjectMapper mapper = new ObjectMapper();
        try {
            temp = Arrays.asList(mapper.readValue(new File(path), Toy[].class));
        } catch (IOException e) {
            System.out.println("err: такого файла не существует");
            return;
        }
        toys.setToys(new PriorityQueue<>(temp));
        System.out.println("-> загружено успешно");
    }
}
