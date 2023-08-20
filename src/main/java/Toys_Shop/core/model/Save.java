package Toys_Shop.core.model;

import Toys_Shop.core.data.ToysDistributor;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Save extends Mode {
    public Save() {
        super("save", "сохранить в файл");
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        System.out.print("Введите имя файла ->");
        String filePath = scanner.next().trim().strip();
        String path = "C:\\Users\\evgga\\IdeaProjects\\Intermediate_Control_Work-2\\" +
                "Toys_Shop\\src\\main\\resources\\" + filePath + ".json";
        ObjectMapper mapper = new ObjectMapper();
        String jsonString;
        try {
            jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(toys.getToys());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } try {
            Files.write(Paths.get(path),
                    jsonString.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            System.out.println("err: ошибка при записи файла");;
        }
        System.out.println("-> сохранено успешно");
    }
}
