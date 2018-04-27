package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) 
	{
		View view= new View();
		Model model = new Model();
		Controller controller = new Controller(view, model);
		controller.run();
	}

}
