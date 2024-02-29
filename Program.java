
public class Program {

	public static void main(String[] args) {
		Sertar s1=new Sertar(3,4,1);
		Sertar s2=new Sertar(3,4,2);
		Birou b=new Birou(s1,s2,30,40,20);
		b.tipareste();
	}

}

