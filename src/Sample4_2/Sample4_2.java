package Sample4_2;

public class Sample4_2 
{
	public static void main(String[] args)
	{
		new RacingCar(1234,20.5,5);
	}
}

class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("���ͤF���l");
	}
	
	public Car(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�Ͳ������]��"+num+"�A�T�o�q��"+gas+"�����l");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�A�T�o�q�]��"+gas);
	}
	
	public void show()
	{
		System.out.println("������"+num);
		System.out.println("�T�o�q��"+gas);
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("�Ͳ��F�ɨ�");
	}
	
	public RacingCar(int n,double g, int c)
	{
		super(n,g);
		course = c;
		System.out.println("�Ͳ��F�s����"+ course +"���ɨ�");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�N�ɨ��s���]��"+course);
	}
}