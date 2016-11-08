import com.lynguyen.model.Song;
import com.lynguyen.model.SongBook;

public class Karaoke {

  public static void main(String[] args) {

    Song song = new Song(
      "Michael Jackson",
      "Beat It",
      "https://youtu.be/Ym0hZG-zNOk"
    );

    SongBook songBook = new SongBook();
    System.out.printf("Adding %s\n", song);

    songBook.addSong(song);

    System.out.printf("There are %d songs.", songBook.getSongCount());

  }

}
