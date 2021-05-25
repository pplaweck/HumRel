package HumRel.agh;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class PeopleCreator {
    private static String[] randomletters = {
        "a",
        "b",
        "c",
        "d",
        "e",
        "f",
        "g",
        "h",
        "i",
        "j",
        "k",
        "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",
                "A",
                "B",
                "C",
                "D",
                "E",
                "F",
                "G",
                "H",
                "I",
                "J",
                "K",
                "L",
                "M",
                "N",
                "O",
                "P",
                "Q",
                "R",
                "S",
                "T",
                "U",
                "V",
                "W",
                "X",
                "Y",
                "Z",
                "0",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6",
                "7",
                "8",
                "9"
    };
    private static String[] names = {
            "Paweł"
            ,"Katarzyna"
            ,"Jan"
            ,"Tomasz"
            ,"Jerzy"
            ,"Dawid"
            ,"Adam"
            ,"Kamil"
            ,"Józef"
            ,"Kamila"
            ,"Dominika"
            ,"Zuzanna"
            ,"Leopold"
            ,"Grzegorz"
            ,"Lech"
            ,"Franciszek"
            ,"Robert"
            ,"Kacper"
            ,"Wiktor"
            ,"Ignacy"
            ,"Jakub"
            ,"Hubert"
            ,"Maciej"
            ,"Bartosz"
            ,"Wojciech"
            ,"Laura"
            ,"Łukasz"
            ,"Barbara"
            ,"Czesław"
            ,"Piotr"
            ,"Urszula"
            ,"Aleksander"
            ,"Aleksandra"
            ,"Jarosław"
            ,"Maria"
            ,"Oswald"
    };
    private static String [] numbers = {
    "0",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9"
};

    private static String[] surnames = {"Nowak"
            ,"Kowalski"
            ,"Lewandowski"
            ,"Grzegorzek"
            ,"Zieliński"
            ,"Duda"
            ,"Lubański"
            ,"Boniek"
            ,"Pohl"
            ,"Jakubik"
            ,"Kubiak"
            ,"Bieniek"
            ,"Milik"
            ,"Piątek"
            ,"Szczęsny"
            ,"Glik"
            ,"Zagumny"
            ,"Syprzak"
            ,"Jurecki"
            ,"Szmal"
            ,"Bielecki"
            ,"Kondratiuk"
            ,"Tomczak"
            ,"Lasek"
            ,"Szukała"
            ,"Grabarczyk"
            ,"Kurek"
            ,"Wójcik"
            ,"Bogunia"
            ,"Sobczyk"
            ,"Majewski"
    };
    private static String[] jobs = {
            "Grafik",

            "Pracownik biurowy",

            "Specjalista ds. marketingu",
            "Urzędnik państwowy",

            "Ekonomista",

            "Lekarz",

            "Programista",

            "Architekt wnętrz / krajobrazu",

            "Specjalista ds. zakupów",

            "Prawnik",

            "Inżynier Środowiska",

            "Specjalista ds. marketingu",

            "Webmaster",

            "Programista baz danych",

            "Automatyk",

            "Specjalista ds. ochrony środowiska",

            "Projektant wzornictwa",

            "Laborant",

            "Dietetyk",

            "Pedagog",

            "Tester aplikacji",

            "Specjalista ds. transportu",

            "Dyrektor ds.Administracyjnych",

            "Spedytor",

            "Specjalista ds. turystyki",

            "Koordynator robót budowlanych",

            "Dyrektor ds. Rozwoju",

            "Key account manager",

            "Specjalista ds. BHP",

            "Technolog",
            "Księgowa",

            "Kurator sądowy",

            "Specjalista ds. obsługi klienta",

            "Analityk rynku",

            "Koordynator sprzedaży",

            "Konstruktor",

            "Agent celny",

            "Przedstawiciel handlowy",

            "Fakturzysta",

            "Tłumacz",

            "Project Manager",

            "Administrator danych osobowych",

            "Adwokat",

            "Doradca zawodowy",

            "Farmaceuta",

            "Specjalista ds. planowania produkcji",

            "Architekt budownictwa",

            "Copywriter",

            "Geodeta",

            "Dziennikarz",

            "Handlowiec",

            "Asystentka zarządu",

            "Specjalista ds. reklamacji",


    };

    public void generateRandomPeople() throws IOException {
        File customersOutput = new File("people.txt");
        File idNameOutput = new File("id_name.txt");
        FileOutputStream fileOutputStream1 = new FileOutputStream(customersOutput);
        FileOutputStream fileOutputStream2 = new FileOutputStream(idNameOutput);
        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(fileOutputStream1));
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(fileOutputStream2));
        bufferedWriter2.write("String id_names[] = {");
        bufferedWriter2.newLine();
        for (int i = 0; i < 200; i++) {
            String name = names[(int)(Math.random() * 1000) % names.length];
            String surname = surnames[(int)(Math.random() * 1000) % surnames.length];
            String job = jobs[(int)(Math.random() * 1000) % jobs.length];
            String description = "Random description";
            int age = (int)(Math.random() * 50) + 18;
            String hash = "#";
            String randomNumber = "";
            String randomMailNumber = "";
            for(int j=0;j<20;j++){
               randomNumber = randomNumber.concat(numbers[(int)(Math.random() * 1000) % numbers.length]);
            }
            for(int c=0;c<2;c++){
                randomMailNumber = randomMailNumber.concat(numbers[(int)(Math.random() * 1000) % numbers.length]);
            }
            String randomPassword = "";
            for(int k=0;k<30;k++){
                randomPassword = randomPassword.concat(randomletters[(int)(Math.random() * 10000) % randomletters.length]);
            }
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            LocalDateTime date = LocalDateTime.now();
            String id_name = name + "_" + surname + "_" + randomNumber;
            String mail = name.toLowerCase() + surname.toLowerCase() + randomMailNumber + "@example.com";
            bufferedWriter1.write("CREATE (" + name + "_" + surname + "_" +  randomNumber +  ":Person {id:'" + randomNumber + "', name:'" + name + "', lastname:'" + surname +
                    "', age:'" + age + "', mail:'" + mail + "', password:'" + randomPassword + "', date_of_account:'" + date + "', job:'" + job + "', facebook:'" + hash + "', instagram:'" + hash + "', linkedin:'" + hash + "', description:'" + description + "'})");
            bufferedWriter1.newLine();
            bufferedWriter2.write("\"" + id_name + "\",");
            bufferedWriter2.newLine();
        }
        bufferedWriter2.write("}");
        bufferedWriter1.close();
        bufferedWriter2.close();
    }
}
