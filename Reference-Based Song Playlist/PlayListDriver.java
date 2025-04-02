
public class PlayListDriver {
	
	public static void main(String [] args) {
		Playlist songs = new Playlist();
		int num = 100;
		for(int i = 0; i < num; i++) {
			songs.add( new Song("Title" + i, "Artist " + i, i )      );
		}
		
		
		songs.add( new Song("Ave Maria", "Bach", 10), 0);
		
		songs.add( new Song("Bronx", "Daddy Yankee", 10), 4);
		
		System.out.println(songs.size());
		
		for(int i = 0; i < num; i++) {
			System.out.println(songs.get(i).getArtist());
		}
		
		
	}

}
