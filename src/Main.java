import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film film1 = new Film("The Godfather", 1972, "Crime/Drama", 9.2);
        Film film2 = new Film("Inception", 2010, "Sci-Fi/Thriller", 8.8);
        Film film3 = new Film("Interstellar", 2014, "Sci-Fi/Adventure", 8.6);
        Film film4 = new Film("The Dark Knight", 2008, "Action/Crime", 9.0);
        Film film5 = new Film("Forrest Gump", 1994, "Drama/Romance", 8.8);

        ArrayList<Film>filmList=new ArrayList<>();
        filmList.add(film1);
        filmList.add(film2);
        filmList.add(film3);
        filmList.add(film4);
        filmList.add(film5);

        Collections.sort(filmList,(f1,f2)->Double.compare(f2.getImbdScore(),f1.getImbdScore()));
        System.out.println("IMDb Puanına Göre Sıralama:");
        for (Film film:filmList){
            System.out.println(film);
        }

        System.out.println();

        Collections.sort(filmList,(f1,f2)->Integer.compare(f1.getPublicationYear(),f2.getPublicationYear()));
        System.out.println("Yayın Yılına Göre Sıralama:");
        for (Film film:filmList){
            System.out.println(film);
        }


        // Kullanıcıdan tür girişi al
        Scanner scanner =new Scanner(System.in);
        System.out.println("\nAramak istediğiniz türü giriniz: \nTürler:\nCrime\nDrama\nSci-Fi\nThriller\nAdventure\nAction\nRomance :");
        System.out.println();
        String arananTur = scanner.nextLine();

        // Filmleri filtrele
        ArrayList<Film> filtrelenmisFilmler = filmturu(filmList, arananTur);

        if (filtrelenmisFilmler.isEmpty()) {
            System.out.println("\nBu türe ait film bulunamadı.");
        } else {
            System.out.println("\nTürü \"" + arananTur + "\" olan filmler:");
            for (Film film : filtrelenmisFilmler) {
                System.out.println(film);
            }
        }

        scanner.close();
    }




    public  static ArrayList<Film> filmturu(ArrayList<Film> filmler,String tur){
        ArrayList<Film>movieTypeList=new ArrayList<>();

        for (Film film:filmler){
            if (film.getType().contains(tur)){
                movieTypeList.add(film);
            }
        }
        return movieTypeList;
    }


}
