import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;

    static Vehicle[] planes = new Plane[5];
    static Vehicle[] cars = new Car[5];
    static Boat[] boats = new Boat[5];
    static Vehicle [] scooters = new Scooter[5];
    static Vehicle[] bicycyles = new Bicycle[5];


    public static void main(String[] args) {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(450,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,110,300,25);
        panel.add(success);


        frame.setVisible(true);



//tworzenie obiektów pojazdów

        cars[0] = new Car("Audi", 1990, "niebieski", 4, 200, new Engine(3.16,
                500, "Bosh"), Size.SMALL, 4);
        cars[1] = new Car("Opel", 2004, "żółty", 4, 300, new Engine
                (9.1, 400, "Opel"), Size.MEDIUM, 5);
        cars[2] = new Car("Suzuki", 2010, "żółty", 4, 400, new Engine
                (4.2, 420, "Suzuki"), Size.SMALL, 3);
        cars[3] = new Car("Mitsubishi", 2019, "srebrny", 5, 300, new Engine
                (11, 700, "Mitsubishi"), Size.XLARGE, 5);
        cars[4] = new Car("Polonez", 1987, "czerwony", 4, 200, new Engine
                (4, 400, "Polonez"), Size.LARGE, 4);
//---------------------------------------------------------------------------------------------------------------------
        planes[0] = new Plane("Samolot", 2015, "biały", 2, 1500, new Engine
                (200, 3000, "Bosh"), Size.LARGE,150);
        planes[1] = new Plane("Samolocik", 2020, "foletowy", 3, 2000, new Engine
                (300, 3500, "Samolocik"), Size.XLARGE,150);
        planes[2] = new Plane("Samolociątko", 2009, "zielony", 2, 2500, new Engine
                (600, 4500, "Samolocik"), Size.SMALL,250);
        planes[3] = new Plane("Samolocisko", 2000, "biały", 3, 3000, new Engine
                (800, 4500, "Samolocik"), Size.XLARGE,350);
//---------------------------------------------------------------------------------------------------------------------
        boats[0]= new Boat("Titanic",1980,"biały",2,80,new Engine(4,200,
                "Bosh"), Size.SMALL,2.30);
        boats[1]= new Boat("Felt",2000,"żółty",0,60,new Engine(3,400,
                "Bosh"), Size.MEDIUM,3.00);
        boats[2]= new Boat("Magdalena",2016,"pomarańczowy",0,90,new Engine(6,300,
                "Bosh"), Size.LARGE,4.00);
//----------------------------------------------------------------------------------------------------------------------
        scooters[0] = new Scooter("Wolt",2019,"zielony",2,40,new Engine(0,200,
                "Wolt"),Size.SMALL,true);
        scooters[1] = new Scooter("Uber",2020,"biało-zielony",2,20,new Engine(0,200,
                "Uber"),Size.SMALL,false);
        scooters[2] = new Scooter("JazdaMiejska",2016,"żółty",2,15,new Engine(0,
                150, "MPK"),Size.SMALL,true);
        scooters[3] = new Scooter("Wolt",2021,"zielony",2,35,new Engine(0,200,
                "Wolt"),Size.SMALL,true);
        scooters[4] = new Scooter("Wolt",2015,"zielony",2,40,new Engine(0,300,
                "Wolt"),Size.SMALL,true);
//----------------------------------------------------------------------------------------------------------------------
        bicycyles[0]= new Bicycle("Moongose",2010,"czarny",2,30,new Engine
                (1,200,"Uber"),Size.MEDIUM);
        bicycyles[1]= new Bicycle("Ghost",2012,"biały",2,20,new Engine
                (1,200,"Uber"),Size.XLARGE);
        bicycyles[2]= new Bicycle("Orbea",2020,"srebrny",2,35,new Engine
                (1,200,"Uber"),Size.LARGE);
        bicycyles[3]= new Bicycle("Moongose",2015,"czarny",2,30,new Engine
                (1,200,"Uber"),Size.SMALL);
        bicycyles[4]= new Bicycle("KTM",2013,"złoty",2,15,new Engine
                (1,200,"Uber"),Size.MEDIUM);
//----------------------------------------------------------------------------------------------------------------------


    //metody na pojazdach
        Upgrade upgrade = new Upgrade();


        upgrade.addPower(cars[0].engine, 200);
        upgrade.addPower(planes[1].engine,700);
        upgrade.addPower(boats[0].engine,100);
        upgrade.addHeight(boats[1],0.5);
        upgrade.addWheels(bicycyles[0],2 );
        cars[3].speedUp();
        planes[4].speedUp();
        bicycyles[4].speedUp();
        scooters[3].speedUp();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if (user.equals("Joanna")&& password.equals("haslo123")) {
            success.setText("Zalogowany");
            try {
                for (int i = 0; i < cars.length; i++) {
                    System.out.println(cars[i].toString());
                    cars[i].reduceSpeed();
                }

            } catch (NullPointerException ex) {
                System.out.println("Nie ma większej ilości samochodów");
            }
            try {
                for (int j = 0; j < planes.length; j++) {
                    System.out.println(planes[j].toString());
                    planes[j].reduceSpeed();
                }
            } catch (NullPointerException ex) {
                System.out.println("Nie ma większej ilości samolotów");
            }

            try {
                for (int l = 0; l < boats.length; l++) {
                    System.out.println(boats[l].toString());
                    boats[l].reduceSpeed();
                }
            }
                catch(NullPointerException ex){
                    System.out.println("Nie ma większej ilości łodzi");
                }
            try{
                for(int m = 0; m < scooters.length; m++){
                    System.out.println(scooters[m].toString());
                    scooters[m].reduceSpeed();
                }
            }catch (NullPointerException ex){
                System.out.println("Nie ma większej ilości hulajnóg");
            }
            try{
                for(int n = 0; n < bicycyles.length; n++){
                    System.out.println(bicycyles[n].toString());
                    bicycyles[n].reduceSpeed();
                }
            }
            catch (NullPointerException ex){
                System.out.println("Nie ma większej ilości rowerów");
            }


        }
        else{
            success.setText("Błędne dane logowania");
            System.out.println("Aby wyświetlić pojazdy wpisz poprawne dane logowania");
        }

    }
}
