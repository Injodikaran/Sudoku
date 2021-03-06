package sudokuService;

public class SolvField implements Cloneable{
	byte[][] sud;//aktueller stand des Sudokus
	byte x;//zeile im Algorytmus
	byte y;//spalte im Algorytmus
	//boolean r;//l�sung relevant / in Ortnung
	boolean f;//l�sung gefunden
	
	public SolvField(byte[][] sud,byte x,byte y,boolean f){
		this.sud=sud;
		this.x=x;
		this.y=y;
		//r=r;
		this.f=f;
	}
	public SolvField clone(){
	SolvField clone = null;

	try {
		clone = (SolvField) super.clone();
		clone.sud=new byte[9][9];
		for(byte b1=0;b1<9;b1++){
			for(byte b2=0;b2<9;b2++){
				clone.sud[b1][b2]=this.sud[b1][b2];
			}
		}
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}

	return clone;
	}
}
