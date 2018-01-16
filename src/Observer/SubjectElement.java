package Observer;

import Elements.Element;
import Observer.Observer;

public class SubjectElement implements Element{
	
	public void attach(Observer obs){
		
	}
	
	public void detach(Observer obs){
		
	}
	
	public void notify2(){
		observers.forEach(Observer::update);
	}
}
