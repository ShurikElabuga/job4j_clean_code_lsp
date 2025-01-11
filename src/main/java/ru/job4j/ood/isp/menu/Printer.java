package ru.job4j.ood.isp.menu;

public class Printer implements MenuPrinter {
    @Override
    public void print(Menu menu) {

        for (Menu.MenuItemInfo item : menu) {
            int strLength = item.getNumber().split("\\.").length - 1;
            String space = "----";
            System.out.println(space.repeat(strLength) + item.getNumber() + item.getName());
        }
    }
}
