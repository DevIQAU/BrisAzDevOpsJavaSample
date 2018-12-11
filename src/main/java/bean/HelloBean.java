package bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

//This is a change to trigger a commit
//This time we will add the TFS Number

@ManagedBean
@SessionScoped
public class HelloBean  implements Serializable{

	private static final long serialVersionUID = -4823295172962937652L;
	
	private String message = "Your Java app is up and running on Azure. This will have been deployed to azure as well after this update";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
