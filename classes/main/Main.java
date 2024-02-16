package project.cinema.classes.main;

import project.cinema.classes.controller.Controller;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();

        String request;
        String response;

//        request = "ADD\nname=Магадаскар\ndutation=150\nprice=10\ngenre=comedy\ndescription=Семейный";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        request = "ADD\nname=Магадаскар\ndutation=150\nprice=10\ngenre=comedy\ndescription=Семейный";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        request = "CLEAR\n";
//        response = controller.doAction(request);
//        System.out.println(response);

//        request = "ADD\nname=Магадаскар\ndutation=100\nprice=10\ngenre=comedy\ndescription=Семейный\nstart=2024-02-15 18:11:44";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        request = "ADD\nname=Миагадаскар\ndutation=100\nprice=10\ngenre=roman\ndescription=Семейный";
//        response = controller.doAction(request);
//        System.out.println(response);

//        request = "UPDATE\nid=3\nname=Магадаскар\ndutation=300\nprice=30\ngenre=comedy\ndescription=Семейный";
//        response = controller.doAction(request);
//        System.out.println(response);

//        request = "OUTPUT\n";
//        response = controller.doAction(request);
//        System.out.println(response);
//
//        request = "FIND\niii";
//        response = controller.doAction(request);
//        System.out.println(response);

//        request = "SORT\ndata";
//        response = controller.doAction(request);
//        System.out.println(response);

//        request = "DELETE\nid=2";
//        response = controller.doAction(request);
//        System.out.println(response);

        request = "OUTPUT\n";
        response = controller.doAction(request);
        System.out.println(response);


    }
}
