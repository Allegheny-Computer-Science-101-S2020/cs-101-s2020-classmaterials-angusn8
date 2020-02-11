package p1;
// parent class
public class Vehicle{
	protected int maxCapacity;
	public Vehicle(){} // default constructor
	public Vehicle(int cap){
		maxCapacity = cap;
	}
	void printM1(){
		System.out.println("Vehicle");
	}
}
