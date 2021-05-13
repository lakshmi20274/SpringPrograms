package bankapplication;

public class Transcations {
	int tId;
	String tType;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String gettType() {
		return tType;
	}
	public void settType(String tType) {
		this.tType = tType;
	}
	public Transcations(int tId, String tType) {
		super();
		this.tId = tId;
		this.tType = tType;
	}
	public Transcations() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Transactions [tId=" + tId + ", tType=" + tType + "]";
	}


}
