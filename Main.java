public class Main {
    static Menu menu = new Menu();
    static App app = new App();

    public static void main(String[] args){
        boolean exit = true;
        while (exit){
            menu.menu();
            switch (menu.choice()){
                case 1 :
                    app.add();
                    break;
                case 2 :
                    app.show();
                    break;
                case 3 :
                    break;
                case 4 :
                    break;
                case 5 :
                    app.delete();
                    break;
                case 0 :
                    System.out.println("Exiting program ...");
                    exit = false;
                    break;
            }
        }
    }
}
