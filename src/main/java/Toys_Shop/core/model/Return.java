package Toys_Shop.core.model;

import Toys_Shop.core.data.ToysDistributor;
import Toys_Shop.core.view.BasicView;

import java.util.Scanner;

public class Return extends Settings {
    public Return(BasicView view) {
        super("back", "назад", view);
    }

    @Override
    public void execute(ToysDistributor toys, Scanner scanner) {
        view.start(view.getControl(), "\nОсновное меню");
    }
}
