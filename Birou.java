public class Birou {
	Sertar s1,s2;
	int l,L,h;
	public Birou(Sertar s1,Sertar s2,int l,int L,int h)
	{
		this.s1=s1;
		this.s2=s2;
		this.l=l;
		this.L=L;
		this.h=h;
	}
	public void tipareste()
	{
		System.out.println("Birou"+l+L+h);
		System.out.println("Cu 2 sertare:");
		s1.tipareste();
		s2.tipareste();
	}
}
