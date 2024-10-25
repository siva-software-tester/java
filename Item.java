package Shop;

public class Item {
public void item(String name, int rate){

	System.out.println("The Item brought is " +name +" and the rate is " +rate);
}
public void item(String name, int qty, float rate) {
	System.out.println("The Item brought is "+name+" the quantity is " + qty +" and the rate is " + rate);
}
	
	public static void main(String[] args) {
Item product= new Item();
product.item("Milk", 10);
product.item("Biscuite", 2, 22.5f);
	}

}
