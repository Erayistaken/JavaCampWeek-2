package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(id:1, name:"Laptop", description:"Monster Notebook", price:3000, stockAmount:2, renk:"siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
