package ru.job4j.ood.isp.menu;

public class TodoApp {
    private static final ActionDelegate DEFAULT_ACTION = () -> System.out.println("Some action");
    private final Menu menu;
    private final Printer printer;

    public TodoApp(Menu menu, Printer printer) {
        this.menu = menu;
        this.printer = printer;
    }

    public boolean addItemRoot(String name) {
        return menu.add(Menu.ROOT, name, DEFAULT_ACTION);
    }

    public boolean addItemChild(String parentName, String childName) {
        return menu.add(parentName, childName, DEFAULT_ACTION);
    }

    public void action(String itemName) {
        menu.select(itemName).ifPresentOrElse(item -> item.getActionDelegate().delegate(),
                () -> System.out.println("Пункт меню не найден."));
    }

    public void printMenu() {
        printer.print(menu);
    }
}
