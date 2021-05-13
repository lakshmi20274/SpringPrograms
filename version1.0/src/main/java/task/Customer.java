package task;

public class Customer {
	 private int custId;
	    private String cusName;
	    public int getCustId() {
	        return custId;
	    }
	    public void setCustId(int custId) {
	        this.custId = custId;
	    }
	    public String getCusName() {
	        return cusName;
	    }
	    public void setCusName(String cusName) {
	        this.cusName = cusName;
	    }
	    public Customer(int custId, String cusName) {
	        super();
	        this.custId = custId;
	        this.cusName = cusName;
	    }
	    public Customer() {
	        super();
	        // TODO Auto-generated constructor stub
	    }
	     public void init(){
	          System.out.println("Bean is going through init.");
	       }
	       public void destroy() {
	          System.out.println("Bean will destroy now.");
	       }
	    @Override
	    public String toString() {
	        return "Customer [custId=" + custId + ", cusName=" + cusName + "]";
	    }
	    

}
