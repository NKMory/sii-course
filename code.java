import java.awt.*;
import java.awt.event.*;


public class code extends Panel implements ActionListener,ItemListener{

    Panel panel;
    Label text;
    Font font;
    Choice choiceManufacturer, choiceResolution, choiceBattery, 
        choiceWirelessCharger, choiceMemory;
    Button buttonBack, buttonNext;
    String curManufacturer, curResolution, curBattery, curWirelessCharger, curMemory;

    class Phone{
        String manufacturer;
        String model;
        String resolution;
        String battery;
        String wirelessCharger;
        String[] memory;
    }

    public code(){
        panel = new Panel(new GridLayout(0,0));

        Phone phone1 = new Phone();
            phone1.manufacturer = "Samsung";
            phone1.model = "Galaxy A34 5G";
            phone1.resolution = "2340x1080";
            phone1.battery = "5000mAh";
            phone1.wirelessCharger = "Не поддерживает";
            phone1.memory = new String[]{"128ГБ","256ГБ"};

        Phone phone2 = new Phone();
            phone2.manufacturer = "Xiaomi";
            phone2.model = "13 Ultra";
            phone2.resolution = "3200x1440";
            phone2.battery = "5000mAh";
            phone2.wirelessCharger = "Поддерживает";
            phone2.memory = new String[]{"256ГБ","512ГБ","1ТБ"};

        Phone phone3 = new Phone();
            phone3.manufacturer = "Google";
            phone3.model = "Pixel 7";
            phone3.resolution = "2400x1080";
            phone3.battery = "4355mAh";
            phone3.wirelessCharger = "Поддерживает";
            phone3.memory = new String[]{};
        
        Phone phone4 = new Phone();
            phone4.manufacturer = "Honor";
            phone4.model = "70 5G";
            phone4.resolution = "2400x1080";
            phone4.battery = "4800mAh";
            phone4.wirelessCharger = "Поддерживает";
            phone4.memory = new String[]{};

        Phone phone5 = new Phone();
            phone5.manufacturer = "Apple";
            phone5.model = "iPhone 13 mini";
            phone5.resolution = "2340x1080";
            phone5.battery = "2406mAh";
            phone5.wirelessCharger = "Поддерживает";
            phone5.memory = new String[]{};


        choiceManufacturer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String name = (String) e.getItem();
                if (name!=null) {
                    System.out.println("Выбран производитель");
                    switch (name) {
                        case "Samsung":
                            System.out.println("Samsung");
                            curManufacturer = "Samsung";
                            break;
                        case "Apple":
                            System.out.println("Apple");
                            curManufacturer = "Apple";
                            break;
                        case "Google":
                            System.out.println("Google");
                            curManufacturer = "Google";
                            break;
                        case "Xiaomi":
                            System.out.println("Xiaomi");
                            curManufacturer = "Xiaomi";
                            break; 
                        case "Honor":
                            System.out.println("Honor");
                            curManufacturer = "Honor";
                            break;  
                    }
                }
            }
        });

        choiceResolution.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String name = (String) e.getItem();
                if(name!= null){
                    switch(name){
                        System.out.println("Выбрано разрешение");
                        case "2340x1080":
                            System.out.println("2340x1080");
                            curResolution = "2340x1080";
                            break;
                        case "2400x1080":
                            System.out.println("2400x1080");
                            curResolution = "2400x1080";
                            break;
                        case "3200x1440":
                            System.out.println("3200x1440");
                            curResolution = "3200x1440";
                            break;
                    }
                }
            }
        });

        choiceBattery.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String name = (String) e.getItem();
                if (name!=null) {
                    System.out.println("Выбрана емкость батареи");
                    switch (name) {
                        case "5000mAh":
                            System.out.println("5000mAh");
                            curBattery = "5000mAh";
                            break;
                        case "4800mAh":
                            System.out.println("4800mAh");
                            curBattery = "4800mAh";
                            break;
                        case "4355mAh":
                            System.out.println("4355mAh");
                            curBattery = "4355mAh";
                        case "2406mAh":
                            System.out.println("2406mAh");
                            curBattery = "2406mAh";
                            break;
                    }
                }
            }
        });

        choiceWirelessCharger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String name = (String) e.getItem();
                if(name!=null){
                    switch(name){
                        case "Поддерживает":
                            System.out.println("Поддерживает");
                            curWirelessCharger = "Поддерживает";
                            break;
                        case "Не поддерживает":
                            System.out.println("Не поддерживает");
                            curWirelessCharger = "Не поддерживает";
                            break;
                    }
                }
            }
        });

        choiceMemory.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String name = (String) e.getItem();
                if(name!=null){
                    switch(name){
                        case "128ГБ":
                            System.out.println("128ГБ");
                            curMemory = "128ГБ";
                            break;
                        case "256ГБ":
                            System.out.println("256ГБ");
                            curMemory = "256ГБ";
                            break;
                        case "512ГБ":
                            System.out.println("512ГБ");
                            curMemory = "512ГБ";
                            break;
                        case "1ТБ":
                            System.out.println("1ТБ");
                            curMemory = "1ТБ";
                            break;
                    }
                }
            }
        });

        add(panel);
        }

    public static void main(String args[]) {
            code panel = new code();
        
            Frame frame = new Frame("Экспертная система по выбору смартфона");	
            frame.add(panel);
            frame.setSize(1260, 660);
            frame.setLocation(100, 100);
            frame.setVisible(true);
            frame.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
        }

        @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'itemStateChanged'");
    }
}
