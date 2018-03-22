import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 

public class CSVreader {

	public static void main(String[] args) 
	{
		List<Book>books = readBooksFromCSV("books.txt");
		for (Book x : books)
		{
			System.out.println(x);
		}

	}
	
	private static List<Book> readBooksFromCSV(String fileName)
	{
		List<Book> list1 = new ArrayList<>();
		Path pathToFile = Paths.get(fileName);
		
		try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII))
		{
			String line = br.readLine();
		
		while (line !=null)
		{
			String[] attributes = line.split(",");
			String name = attributes[0];
			int price = Integer.parseInt(attributes[1]);
			String author = attributes[2];
			
			Book book = new Book (name, price, author);
			list1.add(book);
			line = br.readLine();
		
		}
	}
		catch (IOException ioe) 
		{
            ioe.printStackTrace();
        }
		return list1;
	}
	
	

}
