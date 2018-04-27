package helloworldmvc.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAOHelloWorld 
{
	private static String FileName = "C:\\Users\\guill\\Documents\\Exia\\A1\\Prosit\\UE 5\\prosit 5.5\\Workshop\\Helloworld.txt";
	private static DAOHelloWorld instance =null;
	private String helloWorldMessage= null;


// Constructeur
	private DAOHelloWorld() throws IOException 
	{
		readFile();
	}
	
	private void readFile()
	{
		BufferedReader buff = null;
			try {
				buff= new BufferedReader (new InputStreamReader (new FileInputStream(FileName)));
				this.setHelloWorldMessage(buff.readLine());
				buff.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
/*		FileReader file= new FileReader(FileName);
		BufferedReader buff= new BufferedReader(file);
		String read;
		
		while((read=buff.readLine())!= null)
		{
			setHelloWorldMessage(read);
		}
		buff.close();
*/	}

	
// GET et SET de DAOHelloWorld
	public static final DAOHelloWorld getInstance() throws IOException 
	{
		if (instance==null) 
		{
			setInstance(new DAOHelloWorld());
			
		}
		return instance;
	}

	private static final void setInstance(DAOHelloWorld instance) throws IOException 
	{
		DAOHelloWorld.instance = instance;
	}
	

// GET et SET de helloWorldMessage
	public String getHelloWorldMessage()
	{
		return helloWorldMessage;
	}

	public void setHelloWorldMessage(String helloWorldMessage) 
	{
		this.helloWorldMessage = helloWorldMessage;
	}
	
}
