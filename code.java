import java.awt.*;
import java.awt.event.*;


public class code extends Panel implements ActionListener,ItemListener{

    Panel panelFirst, panelSecond;
    Label text;
    Font font;
    Choice choiceManufacturer, choiceResolution, choiceBattery, 
        choiceWirelessCharger, choiceMemory;
    Button buttonBack, buttonNext;
    String curManufacturer, curResolution, curBattery, curWirelessCharger, curMemory;
    String[] posManufacturer = {"Apple","Google","Honor","Samsung","Xiaomi"};
    String[] posResolution = {"2340x1080","2400x1080","3200x1440"};
    String[] posBattery = {"2406mAh","4355mAh","4800mAh","5000mAh"};
    String[] posWirelessCharger = {"Поддерживает","Не поддерживает"};
    String[] posMemory = {"128ГБ","256ГБ","512ГБ","1ТБ"};
    String[] curParameters = {curManufacturer, curResolution, curBattery, curWirelessCharger, curMemory};

    class Phone{
        String[] manufacturer;
        String model;
        String[] resolution;
        String[] battery;
        String[] wirelessCharger;
        String[] memory;
    }

    public code(){
        panelFirst = new Panel(new GridLayout(0,1));

        Phone phone1 = new Phone();
            phone1.manufacturer = new String[] {"Samsung"};
            phone1.model = "Galaxy A34 5G";
            phone1.resolution = new String[] {"2340x1080"};
            phone1.battery = new String[] {"5000mAh"};
            phone1.wirelessCharger = new String[] {"Не поддерживает"};
            phone1.memory = new String[]{"128ГБ","256ГБ"};

        Phone phone2 = new Phone();
            phone2.manufacturer = new String[] {"Xiaomi"};
            phone2.model = "13 Ultra";
            phone2.resolution = new String[] {"3200x1440"};
            phone2.battery = new String[] {"5000mAh"};
            phone2.wirelessCharger = new String[] {"Поддерживает"};
            phone2.memory = new String[]{"256ГБ","512ГБ","1ТБ"};

        Phone phone3 = new Phone();
            phone3.manufacturer = new String[] {"Google"};
            phone3.model = "Pixel 7";
            phone3.resolution = new String[] {"2400x1080"};
            phone3.battery = new String[] {"4355mAh"};
            phone3.wirelessCharger = new String[] {"Поддерживает"};
            phone3.memory = new String[]{"128ГБ","256ГБ"};
        
        Phone phone4 = new Phone();
            phone4.manufacturer = new String[] {"Honor"};
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
            phone5.memory = new String[]{"128ГБ"};

        Phone[] allPhones = {phone1, phone2, phone3, phone4, phone5};

        //*****************************************
        //Выпадающий список с выбором производителя
        //*****************************************
        choiceManufacturer = new Choice();
        for (int counter = 0; counter < posManufacturer.length; counter++){
            choiceManufacturer.addItem(posManufacturer[counter]);
        }

        choiceManufacturer.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String name = (String) e.getItem();
                if (name!=null) {
                    System.out.println("Выбран производитель");
                    System.out.println(name);
                    curManufacturer = name;
                }
            }
        });
        panelFirst.add(choiceManufacturer);

        //**************************************
        //Выпадающий список с выбором разрешения
        //**************************************
        choiceResolution = new Choice();
        for (int counter = 0; counter < posResolution.length; counter++){
            choiceResolution.addItem(posResolution[counter]);
        }

        choiceResolution.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String name = (String) e.getItem();
                if(name!= null){
                    System.out.println("Выбрано разрешение");
                    System.out.println(name);
                    curResolution = name;
                }
            }
        });
        panelFirst.add(choiceResolution);

        //*******************************************
        //Выпадающий список с выбором емкости батареи
        //*******************************************
        choiceBattery = new Choice();
        for (int counter = 0; counter < posBattery.length; counter++){
            choiceBattery.addItem(posBattery[counter]);
        }

        choiceBattery.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                String name = (String) e.getItem();
                if (name!=null) {
                    System.out.println("Выбрана емкость батареи");
                    System.out.println(name);
                    curBattery = name;
                }
            }
        });
        panelFirst.add(choiceBattery);

        //*********************************************************
        //Выпадающий список с выбором поддержки беспроводой зарядки
        //*********************************************************
        choiceWirelessCharger = new Choice();
        for (int counter = 0; counter < posWirelessCharger.length; counter++){
            choiceWirelessCharger.addItem(posWirelessCharger[counter]);
        }

        choiceWirelessCharger.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String name = (String) e.getItem();
                if(name!=null){
                    System.out.println("Выбрана поддержка беспроводной зарядки");
                    System.out.println(name);
                    curWirelessCharger = name;
                    System.out.println(curWirelessCharger);
                }
            }
        });
        panelFirst.add(choiceWirelessCharger);

        //*********************************************************
        //Выпадающий список с выбором размера внутреннего хранилища
        //*********************************************************
        choiceMemory = new Choice();
        for (int counter = 0; counter < posMemory.length; counter++){
            choiceMemory.addItem(posMemory[counter]);
        }

        choiceMemory.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e){
                String name = (String) e.getItem();
                if(name!=null){
                    System.out.println("Выбрана память емкостью");
                    System.out.println(name);
                    curMemory = name;
                }
            }
        });
        panelFirst.add(choiceMemory);

        buttonNext = new Button("Далее");
        
        panelFirst.add(buttonNext);

        panelFirst.setBackground(Color.green);

        add(panelFirst);

        panelSecond = new Panel(new GridLayout(0,1));
        panelSecond.setBackground(Color.BLUE);

        Boolean isTheRightPhone = false;
        Phone searchedPhone = null;
        for (int curPhoneNum = 0; curPhoneNum < allPhones.length; curPhoneNum++){
            for(int curParamCount = 0; curParamCount < allPhones[curPhoneNum].manufacturer.length; curParamCount++){
                if (allPhones[curPhoneNum].manufacturer[curParamCount] == curManufacturer){
                    isTheRightPhone = true;
                }
            }
            if (!isTheRightPhone){
                continue;
            }

            for(int curParamCount = 0; curParamCount < allPhones[curPhoneNum].resolution.length; curParamCount++){
                if (allPhones[curPhoneNum].resolution[curParamCount] == curResolution){
                    isTheRightPhone = true;
                }
                else{
                    isTheRightPhone = false;
                }
            }
            if (!isTheRightPhone){
                continue;
            }

            for(int curParamCount = 0; curParamCount < allPhones[curPhoneNum].battery.length; curParamCount++){
                if (allPhones[curPhoneNum].battery[curParamCount] == curBattery){
                    isTheRightPhone = true;
                }
                else{
                    isTheRightPhone = false;
                }
            }
            if (!isTheRightPhone){
                continue;
            }
            
            for(int curParamCount = 0; curParamCount < allPhones[curPhoneNum].wirelessCharger.length; curParamCount++){
                if (allPhones[curPhoneNum].wirelessCharger[curParamCount] == curWirelessCharger){
                    isTheRightPhone = true;
                }
                else{
                    isTheRightPhone = false;
                }
            }
            if (!isTheRightPhone){
                continue;
            }

            for(int curParamCount = 0; curParamCount < allPhones[curPhoneNum].memory.length; curParamCount++){
                if (allPhones[curPhoneNum].memory[curParamCount] == curMemory){
                    isTheRightPhone = true;
                }
                else{
                    isTheRightPhone = false;
                }
            }
            if (isTheRightPhone){
                searchedPhone = allPhones[curPhoneNum];
            }
        }
        
        if (searchedPhone != null){
            Label textPhoneWasFound = new Label("По Вашим параметрам подходит телефон:");
            font = new Font("Dialog",Font.PLAIN,14);
            textPhoneWasFound.setFont(font);
            panelSecond.add(textPhoneWasFound);
            
            
            Label textSearchedPhone = new Label(searchedPhone.manufacturer[0] + " " + searchedPhone.model);
            textSearchedPhone.setFont(font);
            panelSecond.add(textSearchedPhone);
        }
        else{
            Label textPhoneWasNotFound = new Label("По Вашим параметрам не было найдено телефона");
            font = new Font("Dialog",Font.PLAIN,14);
            textPhoneWasNotFound.setFont(font);
            panelSecond.add(textPhoneWasNotFound);
        }
        
        buttonNext.addActionListener(e ->{
            Boolean paramIsNull = false;
            System.out.println("Пытаемся перейти далее");

            for (int counter = 0; counter < curParameters.length; counter++){
                if (curParameters[counter] == null){
                    paramIsNull = true;
                    System.out.println("Не выбран параметр");
                }
            }

            if (paramIsNull){
                System.out.println("Выберите все параметры");
            }
            else{
                remove(panelFirst);
                add(panelSecond);
            }
        });
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
