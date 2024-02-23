import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Code extends Panel implements ActionListener,ItemListener {

    JPanel panelFirst, panelSecond;
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

        String[] phoneParams = {manufacturer,resolution,battery,wirelessCharger,memory};

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

        public String getParams(int curParamNum) {
            return this.phoneParams[curParamNum];
        }
    }

    public Code(){
        panelFirst = new JPanel(new GridBagLayout());
        panelFirst.setBackground(Color.green);
        

        Phone phoneOne = new Phone();
        phoneOne.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Samsung")));
        phoneOne.setModel("Galaxy A34 5G");
        phoneOne.setResolution(posResolution.get(posResolution.indexOf("2340x1080")));
        phoneOne.setBattery(posBattery.get(posBattery.indexOf("5000mAh")));
        phoneOne.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Не поддерживает")));
        phoneOne.setMemory(posMemory.get(posMemory.indexOf("128ГБ")));

        Phone phoneTwo = new Phone();
        phoneTwo.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Samsung")));
        phoneTwo.setModel("Galaxy A34 5G");
        phoneTwo.setResolution(posResolution.get(posResolution.indexOf("2340x1080")));
        phoneTwo.setBattery(posBattery.get(posBattery.indexOf("5000mAh")));
        phoneTwo.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Не поддерживает")));
        phoneTwo.setMemory(posMemory.get(posMemory.indexOf("256ГБ")));

        Phone phoneThree = new Phone();
        phoneThree.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Xiaomi")));
        phoneThree.setModel("13 Ultra");
        phoneThree.setResolution(posResolution.get(posResolution.indexOf("3200x1440")));
        phoneThree.setBattery(posBattery.get(posBattery.indexOf("5000mAh")));
        phoneThree.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneThree.setMemory(posMemory.get(posMemory.indexOf("256ГБ")));

        Phone phoneFour = new Phone();
        phoneFour.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Xiaomi")));
        phoneFour.setModel("13 Ultra");
        phoneFour.setResolution(posResolution.get(posResolution.indexOf("3200x1440")));
        phoneFour.setBattery(posBattery.get(posBattery.indexOf("5000mAh")));
        phoneFour.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneFour.setMemory(posMemory.get(posMemory.indexOf("512ГБ")));

        Phone phoneFive = new Phone();
        phoneFive.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Xiaomi")));
        phoneFive.setModel("13 Ultra");
        phoneFive.setResolution(posResolution.get(posResolution.indexOf("3200x1440")));
        phoneFive.setBattery(posBattery.get(posBattery.indexOf("5000mAh")));
        phoneFive.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneFive.setMemory(posMemory.get(posMemory.indexOf("1ТБ")));

        Phone phoneSix = new Phone();
        phoneSix.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Google")));
        phoneSix.setModel("Pixel 7");
        phoneSix.setResolution(posResolution.get(posResolution.indexOf("2400x1080")));
        phoneSix.setBattery(posBattery.get(posBattery.indexOf("4355mAh")));
        phoneSix.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneSix.setMemory(posMemory.get(posMemory.indexOf("128ГБ")));

        Phone phoneSeven = new Phone();
        phoneSeven.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Google")));
        phoneSeven.setModel("Pixel 7");
        phoneSeven.setResolution(posResolution.get(posResolution.indexOf("2400x1080")));
        phoneSeven.setBattery(posBattery.get(posBattery.indexOf("4355mAh")));
        phoneSeven.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneSeven.setMemory(posMemory.get(posMemory.indexOf("256ГБ")));

        Phone phoneEight = new Phone();
        phoneEight.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Honor")));
        phoneEight.setModel("70 5G");
        phoneEight.setResolution(posResolution.get(posResolution.indexOf("2400x1080")));
        phoneEight.setBattery(posBattery.get(posBattery.indexOf("4800mAh")));
        phoneEight.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneEight.setMemory(posMemory.get(posMemory.indexOf("128ГБ")));

        Phone phoneNine = new Phone();
        phoneNine.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Honor")));
        phoneNine.setModel("70 5G");
        phoneNine.setResolution(posResolution.get(posResolution.indexOf("2400x1080")));
        phoneNine.setBattery(posBattery.get(posBattery.indexOf("4800mAh")));
        phoneNine.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneNine.setMemory(posMemory.get(posMemory.indexOf("256ГБ")));

        Phone phoneTen = new Phone();
        phoneTen.setManufacturer(posManufacturer.get(posManufacturer.indexOf("Apple")));
        phoneTen.setModel("iPhone 13 mini");
        phoneTen.setResolution(posResolution.get(posResolution.indexOf("2340x1080")));
        phoneTen.setBattery(posBattery.get(posBattery.indexOf("2406mAh")));
        phoneTen.setWirelessCharger(posWirelessCharger.get(posWirelessCharger.indexOf("Поддерживает")));
        phoneTen.setMemory(posMemory.get(posMemory.indexOf("128ГБ")));

        List<Phone> allPhones = new ArrayList<>();
        allPhones.add(phoneOne);
        allPhones.add(phoneTwo);
        allPhones.add(phoneThree);
        allPhones.add(phoneFour);
        allPhones.add(phoneFive);
        allPhones.add(phoneSix);
        allPhones.add(phoneSeven);
        allPhones.add(phoneEight);
        allPhones.add(phoneNine);
        allPhones.add(phoneTen);

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

        buttonNext = new Button("Далее");


        GridBagConstraints constraints = new GridBagConstraints();
       
        // По умолчанию натуральная высота, максимальная ширина 
        constraints.fill = GridBagConstraints.HORIZONTAL; 
        constraints.weightx = 0.5;
        constraints.gridy   = 0  ;  // нулевая ячейка таблицы по вертикали    

        constraints.gridx = 0;      // нулевая ячейка таблицы по горизонтали
        panelFirst.add(choiceManufacturer, constraints); 
  
        constraints.gridx = 1;      // первая ячейка таблицы по горизонтали
        panelFirst.add(choiceResolution, constraints); 
          
        constraints.gridx = 2;      // вторая ячейка таблицы по горизонтали
        panelFirst.add(choiceBattery, constraints); 

        constraints.gridx     = 0;    // нулевая ячейка по горизонтали
        constraints.gridy     = 1;    // первая ячейка по вертикали
        panelFirst.add(choiceWirelessCharger, constraints); 

        constraints.gridx = 1;
        panelFirst.add(choiceMemory,constraints);
 
 
        constraints.weighty   = 1.0;  // установить отступ
                                      // установить кнопку в конец окна
        constraints.anchor    = GridBagConstraints.PAGE_END; 
        constraints.insets    = new Insets(5, 0, 0, 0);  // граница ячейки по Y 
        constraints.gridx     = 1;    // первая ячейка таблицы по горизонтали
        constraints.gridy     = 2;    // вторая ячейка по вертикали
        panelFirst.add(buttonNext, constraints);  

        add(panelFirst);

        buttonNext.addActionListener(e ->{
            panelSecond = new JPanel(new GridLayout(0,1));

            remove(panelFirst);
            add(panelSecond);

            panelSecond.setBackground(Color.BLUE);

            Phone rightPhone = null;

            for (Phone phone:allPhones) {
                if (equals(currentPhoneSearch, phone)){
                    rightPhone = phone;
                }
            }

            List<String> currentParams = new ArrayList<>();
            currentParams.add(currentPhoneSearch.getBattery());
            currentParams.add(currentPhoneSearch.getManufacturer());
            currentParams.add(currentPhoneSearch.getMemory());
            currentParams.add(currentPhoneSearch.getResolution());
            currentParams.add(currentPhoneSearch.getWirelessCharger());

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
                System.out.println(textPhoneWasNotFound);
                font = new Font("Dialog",Font.PLAIN,14);
                textPhoneWasNotFound.setFont(font);
                panelSecond.add(textPhoneWasNotFound);
            }

            panelSecond.revalidate();

            for (String param:currentParams) {
                if (param.equals(inactiveChoice)){
                    System.out.println("Не выбран один из параметров");
                    break;
                }
            }

            buttonBack = new Button("Назад");
            panelSecond.add(buttonBack);

            buttonBack.addActionListener(x ->{
                remove(panelSecond);
                add(panelFirst);
            });

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

        JFrame frame = new JFrame("Экспертная система по выбору смартфона");
        frame.add(panel);
        frame.setSize(600, 200);
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
