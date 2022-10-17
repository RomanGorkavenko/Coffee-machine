package HWSem6OOP.coffee_machine.controller;

import java.util.Scanner;

public class ControllerMenu {
    private final ControllerEspresso controllerEspresso;
    private final ControllerLatte controllerLatte;
    private final ControllerAmericano controllerAmericano;
    private final ControllerMocha controllerMocha;

    public ControllerMenu() {
        this.controllerEspresso = new ControllerEspresso();
        this.controllerLatte = new ControllerLatte();
        this.controllerAmericano = new ControllerAmericano();
        this.controllerMocha = new ControllerMocha();
    }

    public void menu(){
        System.out.println("Какой кофе вы хотите приготовить?");
        String menuString = "1. Espresso.\n2. Latte.\n3. Americano.\n4. Мокко.\nВведите 1, 2, 3 или 4.\n";
        int answer = inputNumber(menuString, 4);

        switch (answer) {
            case 1:
                System.out.println(controllerEspresso.getEspresso("7 g.", "30 ml."));
                break;
            case 2:
                boolean answerSweetLatte = menuSweet();
                if(answerSweetLatte) {
                    System.out.println(controllerLatte.getLatteSweet("7 g.", "30 ml.",
                            420, "5 g."));
                }else {
                    System.out.println(controllerLatte.getLatte("7 g.", "30 ml.", 420));
                }
                break;
            case 3:
                boolean answerSweetAmericano = menuSweet();
                if(answerSweetAmericano) {
                    System.out.println(controllerAmericano.getAmericanoSweet("7 g.", "30 ml.",
                            "90 ml.", "5 g."));
                }else {
                    System.out.println(controllerAmericano.getAmericano("7 g.", "30 ml.",
                            "90 ml."));
                }
                break;
            case 4:
                System.out.println(controllerMocha.getMocha("30 g.", "7 g.", "30 ml.",
                        "30 ml.", "30 ml."));
        }

    }

    public boolean menuSweet(){
        System.out.println("Добавить сахар?");
        String menuStringSweet = "1. Да.\n2. Нет.\nВведите 1 или 2.\n";
        int answerSweet = inputNumber(menuStringSweet, 2);
        boolean result = false;

        switch (answerSweet) {
            case 1:
                result = true;
                break;
            case 2:
                break;
        }

        return result;
    }

    public int inputNumber(String str, int number) {
        Scanner input = new Scanner(System.in);
        System.out.print(str);
        int num;
        if (input.hasNextInt()) {
            num = input.nextInt();
            if (num < 0 || num > number){
                System.out.println("Ошибка ввода.");
                //input.next();
                num = inputNumber(str, number);
            }
        } else {
            System.out.println("Ошибка ввода.");
            input.next();
            num = inputNumber(str, number);
        }
        return num;
    }
}
