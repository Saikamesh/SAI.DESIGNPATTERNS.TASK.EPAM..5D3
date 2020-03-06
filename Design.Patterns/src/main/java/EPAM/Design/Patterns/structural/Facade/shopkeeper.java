package EPAM.Design.Patterns.structural.Facade;
public class shopkeeper {
	  private mobileshop i;  
	    private mobileshop ss;  
	    private mobileshop op;  
	      
	    public shopkeeper(){  
	        i= new iphone();  
	        ss=new samsung();  
	        op=new oneplus();  
	    }  
	    public void iphonesale(){  
	        i.modelNo();  
	        i.price();  
	    }  
	        public void samsungsale(){  
	        ss.modelNo();  
	        ss.price();  
	    }  
	   public void oneplussale(){  
	    op.modelNo();  
	    op.price();  
	        }  

}
