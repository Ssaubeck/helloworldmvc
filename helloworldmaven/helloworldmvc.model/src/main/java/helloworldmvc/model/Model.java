package helloworldmvc.model;

import java.io.IOException;

import helloworldmvc.contract.IModel;

public class Model implements IModel
{
	public String getHelloWorld()
	{
		DAOHelloWorld i = null;
		try {
			i = DAOHelloWorld.getInstance();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i.getHelloWorldMessage();
	}
}
