import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files; 
import java.nio.file.Path; 
import java.nio.file.Paths; 
import java.util.ArrayList; 
import java.util.List; 

public class Book 
{
	private String name;
	private int price;
	private String author;
	
	public Book(String name, int price, String author)
	{
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getPrice() 
	{
		return price;
	}
	
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}

	@Override
	public String toString() 
	{
		return "Book [name=" + name + ", price=" + price + ", author=" + author + "]";
	}
	
	
}
