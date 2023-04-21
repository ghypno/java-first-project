import java.util.Scanner;

public class AutoArraysString {
    private Scanner scannerForNameArray;

    private Scanner scannerForSizeArray;

    private Scanner scannerForChooseMenu;
    private Scanner scannerForString;
    private String name;
    private int size;
    private String choose;

    private int chooseMassive;

    private String arrayString;


    private boolean startArraysString;

    private boolean startArraysInputData;

    private boolean startMenuArraysString;

    private boolean informationOfError;

    private boolean continueCodeOfSize;

    private boolean errorContinueCodeOfSize;

    private boolean menuMassiveConfigure;

    private boolean menuMassiveInformation;

    private boolean informationForErrorName;


    public AutoArraysString() {
        // create object for Scanner
        this.scannerForNameArray = new Scanner(System.in);
        this.scannerForSizeArray = new Scanner(System.in);
        this.scannerForChooseMenu = new Scanner(System.in);
        this.scannerForString = new Scanner(System.in);


        // create variables for Start Auto Arrays String
        this.startArraysString = false;
        this.startArraysInputData = false;
        this.startMenuArraysString = false;
        this.informationOfError = false;
        this.informationForErrorName = false;
        this.continueCodeOfSize = false;
        this.errorContinueCodeOfSize = false;
        this.menuMassiveConfigure = false;
        this.menuMassiveInformation = false;


    }

    // main method for String Arrays
    public void StringArrays() {
        // open thread auto Arrays String
        startArraysString = true;

        // main loop method (no touch admin)
        while (startArraysString == true) {
            String[] arrayString = null;
            // clear console
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            // text board the user
            System.out.println("||| AUTO ARRAYS STRING |||");

            // ask the user input name the new Arrays
            // if an error occurs then output this

            if(informationForErrorName == true){
                System.out.println("||| ВЫ НЕ ВВЕЛИ ИМЯ ДЛЯ МАССИВА |||");
            }
            System.out.println("-------------------------------------------");
            System.out.print("||| ===> ДАЙТЕ НАЗВАНИЕ ДЛЯ ВАШЕГО МАССИВА: ");

            name = scannerForNameArray.nextLine();



            // if name the arrays NULL view text error
            if(name == ""){
                informationForErrorName = true;
                continue;

            }


            // open thread
            errorContinueCodeOfSize = true;


            while (errorContinueCodeOfSize == true) {
                if (informationOfError = true) {
                    // close thread
                    informationForErrorName = false;
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                }
                if (informationOfError == true) {
                    System.out.println("||| ДЛЯ ИСБЕЖАНИЕ ОШИБОК ПРИ ЗАДАНИЙ РАЗМЕРОВ В МАССИВ ИСПОЛЬЗУЙТЕ ЦИФРЫ |||");
                    System.out.println("----------------------------------------------------------------------------");

                }

                System.out.print("||| ===> ЗАДАЙТЕ РАЗМЕР ДЛЯ МАССИВА " + name + " : ");
                // ask the user input size the Arrays
                try {
                    size = Integer.parseInt(scannerForSizeArray.nextLine());
                    arrayString = new String[size];
                    errorContinueCodeOfSize = false;
                    startArraysString = false;
                    menuMassiveConfigure = true;

                } catch (NumberFormatException e) {
                    informationOfError = true;
                    continueCodeOfSize = true;
                    if (continueCodeOfSize == true) {
                        continue;
                    }

                }

            }


            // clear console
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            // close information
            informationOfError = false;
            continueCodeOfSize = false;
            // if massive great create arrays
            while (menuMassiveConfigure) {
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("||| ===> МАССИВ " + name + " С РАЗМЕРОМ " + size + " УСПЕШНО СОЗДАН |||");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("||| УПРАВЛЕНИЕ МАССИВОМ " + name + " |||");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("||| [1] > ВНЕСТИ ДАННЫЕ В МАССИВ");
                System.out.println("||| [2] > ИЗМЕНИТЬ ТИП ДАННЫЙ ДЛЯ МАССИВА");
                System.out.println("||| [3] > ИЗМЕНИТЬ ИМЯ МАССИВА");
                System.out.println("||| [4] > ИЗМЕНИТЬ РАЗМЕР МАССИВА");
                System.out.println("||| [5] > УДАЛИТЬ МАССИВ");
                System.out.println("-------------------------------------------------------------------------");
                System.out.print("||| ===> ВПИШИТЕ ВЫБОР СЮДА: ");
                choose = scannerForChooseMenu.nextLine();

                // switch operator for choose client
                switch (choose) {
                    default:
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        break;
                    case "1":
                        // close thread String Arrays
                        startArraysString = false;
                        // open thread the Input Data in Arrays
                        startArraysInputData = true;

                        // main loop $
                        while (startArraysInputData == true) {
                            // clear console
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                            // main block
                            System.out.println("||| AUTO MASSIVE STRING |||");
                            for (int i = 0; i < size; i++) {
                                System.out.println("-------------------------------------------");
                                System.out.print("||| ===> ВВЕДИТЕ ДАННЫЕ В ЭЛЕМЕНТ ПОД НОМЕРОМ " + (i + 1) + ": ");
                                arrayString[i] = scannerForString.nextLine();
                            }

                            // close threading Arrays Input
                            startArraysInputData = false;

                            // open threading Arrays String Menu
                            startMenuArraysString = true;


                            // clear console
                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

                            // info the user
                            while (startMenuArraysString == true) {
                                System.out.println("||| СПАСИБО ЗА ИСПОЛЬЗЫВАНИЕ AUTO ARRAYS STRING |||");
                                System.out.println("----------------------------------------------------");
                                System.out.println("||| В МАССИВ " + name + " ДАННЫЕ УСПЕШНО ЗАГРУЖЕНЫ |||");
                                System.out.println("----------------------------------------------------");
                                System.out.println("||| [1] > ПОКАЗАТЬ ДАННЫЕ С МАССИВА");
                                System.out.println("||| [2] > ПЕРЕПИСАТЬ ДАННЫЕ С МАССИВА");
                                System.out.println("||| [3] > ВЕРНУТЬСЯ К СОЗДАНИЮ МАССИВА");
                                System.out.println("----------------------------------------------------");
                                System.out.print("|||||||| ==> [4] > ВПИШИТЕ ВЫБОР СЮДА: ");
                                chooseMassive = scannerForChooseMenu.nextInt();

                                switch (chooseMassive) {
                                    case 1:
                                        startMenuArraysString = false;
                                        menuMassiveInformation = true;
                                        while (menuMassiveInformation == true) {
                                            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                                            System.out.println("||| ==> СЛЕДУЩИЕ ДАННЫЕ С МАССИВА " + name + " |||");
                                            for (int i = 0; i < size; i++) {
                                                System.out.println("--------------------------------------------------------------------------------------");
                                                System.out.println("||| НОМЕР ИНДЕКСА: " + (i + 1) + " |||" + " ДАННЫЕ С МАССИВА: " + arrayString[i] + " |||");


                                            }

                                            System.out.println("_______________________________________________________________________________________");
                                            System.out.println("|||||| [1] > ВЕРНУТЬСЯ К ПУНКТУ УПРАВЛЕНИЯМ МАССИВА"  + " |||||");
                                            System.out.println("_______________________________________________________________________________________");
                                            System.out.print("|||||| ==> [2] > ВПИШИТЕ ВЫБОР СЮДА: " + "|||||");
                                            chooseMassive = scannerForChooseMenu.nextInt();



                                        }


                                }

                            }

                        }


                }


            }
        }


    }
}


