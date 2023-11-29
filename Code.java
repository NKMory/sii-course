import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;


public class Code extends Panel implements ActionListener,ItemListener {

    Panel panelFirst, panelSecond;
    Label text;
    Font font;
    Choice choiceManufacturer, choiceResolution, choiceBattery,
            choiceWirelessCharger, choiceMemory;
    Button buttonBack, buttonNext;
    String inactiveChoice = "Выберите вариант";
    List<String> posManufacturer = List.of("Apple","Google","Honor","Samsung","Xiaomi");
    List<String> posResolution = List.of("2340x1080","2400x1080","3200x1440");
    List<String> posBattery = List.of("2406mAh","4355mAh","4800mAh","5000mAh");
    List<String> posWirelessCharger = List.of("Поддерживает","Не поддерживает");
    List<String> posMemory = List.of("128ГБ","256ГБ","512ГБ","1ТБ");

    private static class Phone{
        String manufacturer;
        String model;
        String resolution;
        String battery;
        String wirelessCharger;
        String memory;

        public String getManufacturer() {
            return manufacturer;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getResolution() {
            return resolution;
        }

        public void setResolution(String resolution) {
            this.resolution = resolution;
        }

        public String getBattery() {
            return battery;
        }

        public void setBattery(String battery) {
            this.battery = battery;
        }

        public String getWirelessCharger() {
            return wirelessCharger;
        }

        public void setWirelessCharger(String wirelessCharger) {
            this.wirelessCharger = wirelessCharger;
        }

        public String getMemory() {
            return memory;
        }

        public void setMemory(String memory) {
            this.memory = memory;
        }


        @Override
        public String toString() {
            return "Phone{" +
                    "manufacturer='" + manufacturer + '\'' +
                    ", model='" + model + '\'' +
                    ", resolution='" + resolution + '\'' +
                    ", battery='" + battery + '\'' +
                    ", wirelessCharger='" + wirelessCharger + '\'' +
                    ", memory='" + memory + '\'' +
                    '}';
        }
    }

    public Code(){
        panelFirst = new Panel(new GridLayout(0,1));

/*         Phone phoneOne = new Phone();
        phoneOne.setManufacturer(posManufacturer[3]);
        phoneOne.setModel("Galaxy A34 5G");
        phoneOne.setResolution(posResolution[0]);
        phoneOne.setBattery(posBattery[3]);
        phoneOne.setWirelessCharger(posWirelessCharger[1]);
        phoneOne.setMemory(posMemory[0]); */

        Phone phoneOne = new Phone();
        phoneOne.setManufacturer(posManufacturer.indexOf("Samsung"));
        phoneOne.setModel("Galaxy A34 5G");
        phoneOne.setResolution(posResolution[0]);
        phoneOne.setBattery(posBattery[3]);
        phoneOne.setWirelessCharger(posWirelessCharger[1]);
        phoneOne.setMemory(posMemory[0]);

        Phone phoneTwo = new Phone();
        phoneTwo.setManufacturer(posManufacturer[3]);
        phoneTwo.setModel("Galaxy A34 5G");
        phoneTwo.setResolution(posResolution[0]);
        phoneTwo.setBattery(posBattery[3]);
        phoneTwo.setWirelessCharger(posWirelessCharger[1]);
        phoneTwo.setMemory(posMemory[1]);

        Phone phoneThree = new Phone();
        phoneThree.setManufacturer(posManufacturer[4]);
        phoneThree.setModel("13 Ultra");
        phoneThree.setResolution(posResolution[2]);
        phoneThree.setBattery(posBattery[3]);
        phoneThree.setWirelessCharger(posWirelessCharger[0]);
        phoneThree.setMemory(posMemory[1]);

        Phone phoneFour = new Phone();
        phoneFour.setManufacturer(posManufacturer[4]);
        phoneFour.setModel("13 Ultra");
        phoneFour.setResolution(posResolution[2]);
        phoneFour.setBattery(posBattery[3]);
        phoneFour.setWirelessCharger(posWirelessCharger[0]);
        phoneFour.setMemory(posMemory[2]);

        Phone phoneFive = new Phone();
        phoneFive.setManufacturer(posManufacturer[4]);
        phoneFive.setModel("13 Ultra");
        phoneFive.setResolution(posResolution[2]);
        phoneFive.setBattery(posBattery[3]);
        phoneFive.setWirelessCharger(posWirelessCharger[0]);
        phoneFive.setMemory(posMemory[3]);
/*        

        Phone phone3 = new Phone();
            phone3.manufacturer = new String[] {"Google"};
            phone3.model = "Pixel 7";
            phone3.resolution = new String[] {"2400x1080"};
            phone3.battery = new String[] {"4355mAh"};
            phone3.wirelessCharger = new String[] {"Поддерживает"};
            phone3.memory = new String[]{"128ГБ","256ГБ"};
        
        Phone phone4 = new Phone();
            phone4.manufacturer = ;
            phone4.model = "70 5G";
            phone4.resolution = new String[] {"2400x1080"};
            phone4.battery = new String[] {"4800mAh"};
            phone4.wirelessCharger = new String[] {"Поддерживает"};
            phone4.memory = new String[]{"128ГБ","256ГБ"};

        Phone phone5 = new Phone();
            phone5.manufacturer = new String[] {"Apple"};
            phone5.model = "iPhone 13 mini";
            phone5.resolution = new String[] {"2340x1080"};
            phone5.battery = new String[] {"2406mAh"};
            phone5.wirelessCharger = new String[] {"Поддерживает"};
            phone5.memory = new String[]{"128ГБ"};*/

        List<Phone> allPhones = new ArrayList<>();
        allPhones.add(phoneOne);
        allPhones.add(phoneTwo);
        allPhones.add(phoneThree);
        allPhones.add(phoneFour);
        allPhones.add(phoneFive);

        //*****************************************
        //Выпадающий список с выбором производителя
        //*****************************************

        Phone currentPhoneSearch = new Phone();

        choiceManufacturer = new Choice();
        choiceManufacturer.add(inactiveChoice);
        currentPhoneSearch.setManufacturer(inactiveChoice);
        for (String manufacturer : posManufacturer) {
            choiceManufacturer.addItem(manufacturer);
        }

        choiceManufacturer.addItemListener(e -> {
            String choiceManufacturer = (String) e.getItem();
            if (!choiceManufacturer.equals(inactiveChoice)) {
                System.out.println("Выбран производитель " + choiceManufacturer);
                currentPhoneSearch.setManufacturer(choiceManufacturer);
            }else{
                System.out.println("Выбран неверный производитель");
            }
        });
        panelFirst.add(choiceManufacturer);

        //**************************************
        //Выпадающий список с выбором разрешения
        //**************************************
        choiceResolution = new Choice();
        choiceResolution.add(inactiveChoice);
        currentPhoneSearch.setResolution(inactiveChoice);
        for (String resolution : posResolution) {
            choiceResolution.addItem(resolution);
        }

        choiceResolution.addItemListener(e -> {
            String choiceResolution = (String) e.getItem();
            if(!choiceResolution.equals(inactiveChoice)){
                System.out.println("Выбрано разрешение " + choiceResolution);
                currentPhoneSearch.setResolution(choiceResolution);
            }else{
                System.out.println("Выбрано неверное разрешение");
            }
        });
        panelFirst.add(choiceResolution);

        //*******************************************
        //Выпадающий список с выбором емкости батареи
        //*******************************************
        choiceBattery = new Choice();
        choiceBattery.add(inactiveChoice);
        currentPhoneSearch.setBattery(inactiveChoice);
        for (String battery : posBattery) {
            choiceBattery.addItem(battery);
        }

        choiceBattery.addItemListener(e -> {
            String choiceBattery = (String) e.getItem();
            if (!choiceBattery.equals(inactiveChoice)) {
                System.out.println("Выбрана емкость батареи " + choiceBattery);
                currentPhoneSearch.setBattery(choiceBattery);
            }else{
                System.out.println("Выбрана неверная емкость батареи");
            }
        });
        panelFirst.add(choiceBattery);

        //*********************************************************
        //Выпадающий список с выбором поддержки беспроводой зарядки
        //*********************************************************
        choiceWirelessCharger = new Choice();
        choiceWirelessCharger.add(inactiveChoice);
        currentPhoneSearch.setWirelessCharger(inactiveChoice);
        for (String wirelessCharger : posWirelessCharger) {
            choiceWirelessCharger.addItem(wirelessCharger);
        }

        choiceWirelessCharger.addItemListener(e -> {
            String choiceWirelessCharger = (String) e.getItem();
            if(!choiceWirelessCharger.equals(inactiveChoice)){
                System.out.println("Выбрана поддержка беспроводной зарядки " + choiceWirelessCharger);
                currentPhoneSearch.setWirelessCharger(choiceWirelessCharger);
            }else{
                System.out.println("Выбран неверный тип поддержки беспроводной зарядки");
            }
        });
        panelFirst.add(choiceWirelessCharger);

        //*********************************************************
        //Выпадающий список с выбором размера внутреннего хранилища
        //*********************************************************
        choiceMemory = new Choice();
        choiceMemory.add(inactiveChoice);
        currentPhoneSearch.setMemory(inactiveChoice);
        for (String memory : posMemory) {
            choiceMemory.addItem(memory);
        }

        choiceMemory.addItemListener(e -> {
            String choiceMemory = (String) e.getItem();
            if(!choiceMemory.equals(inactiveChoice)){
                System.out.println("Выбрана память емкостью " + choiceMemory);
                currentPhoneSearch.setMemory(choiceMemory);
            }
        });

        panelFirst.add(choiceMemory);

        buttonNext = new Button("Далее");


        panelFirst.add(buttonNext);

        panelFirst.setBackground(Color.GREEN);

        add(panelFirst);

        buttonNext.addActionListener(e ->{
            panelSecond = new Panel(new GridLayout(0,1));

            remove(panelFirst);
            add(panelSecond);

            panelSecond.setBackground(Color.BLUE);

            Phone rightPhone = null;

            for (Phone phone:allPhones) {
                if (equals(currentPhoneSearch, phone)){
                    rightPhone = phone;
                }
            }

            if (rightPhone != null){
                Label textPhoneWasFound = new Label("По Вашим параметрам подходит телефон:");
                System.out.println("По Вашим параметрам подходит телефон:");
                font = new Font("Dialog",Font.PLAIN,14);
                textPhoneWasFound.setFont(font);
                panelSecond.add(textPhoneWasFound);

                Label textSearchedPhone = new Label(rightPhone.getManufacturer() + " " + rightPhone.getModel());
                System.out.println(rightPhone.getManufacturer() + " " + rightPhone.getModel());
                textSearchedPhone.setFont(font);
                panelSecond.add(textSearchedPhone);
            }
            else{
                Label textPhoneWasNotFound = new Label("По Вашим параметрам не было найдено телефона");
                System.out.println("По Вашим параметрам не было найдено телефона");
                font = new Font("Dialog",Font.PLAIN,14);
                textPhoneWasNotFound.setFont(font);
                panelSecond.add(textPhoneWasNotFound);
            }

            panelSecond.revalidate();

            List<String> currentParams = new ArrayList<>();
            currentParams.add(currentPhoneSearch.getBattery());
            currentParams.add(currentPhoneSearch.getManufacturer());
            currentParams.add(currentPhoneSearch.getMemory());
            currentParams.add(currentPhoneSearch.getResolution());
            currentParams.add(currentPhoneSearch.getWirelessCharger());

            for (String param:currentParams) {
                if (param.equals(inactiveChoice)){
                    System.out.println("Не выбран один из параметров");
                    break;
                }
            }

        });
    }

    private boolean equals(Phone currentPhoneSearch, Phone phone) {
        return currentPhoneSearch.getMemory().equals(phone.getMemory()) &&
                currentPhoneSearch.getManufacturer().equals(phone.getManufacturer()) &&
                currentPhoneSearch.getBattery().equals(phone.getBattery()) &&
                currentPhoneSearch.getResolution().equals(phone.getResolution()) &&
                currentPhoneSearch.getWirelessCharger().equals(phone.getWirelessCharger());
    }

    public static void main(String[] args) {
        Code panel = new Code();

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
