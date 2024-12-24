public class Main {
    static App app = new App();

    public static void main(String[] args){
        boolean exit = true;
        while (exit){
            app.menu();
            switch (app.choice()){
                case 1 :
                    app.add();
                    break;
                case 2 :
                    app.show();
                    break;
                case 3 :
                    app.find();
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
