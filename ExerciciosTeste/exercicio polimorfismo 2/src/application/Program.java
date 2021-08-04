package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data");
			System.out.printf("Common, used or imported (c/u/i)? ");
			sc.nextLine();
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				Date date = sdf.parse(sc.next());
				
				list.add(new UsedProduct(name, price, date));
			}
			else if(ch == 'i') {
				System.out.print("Customs fee: ");
				double cf = sc.nextDouble();
				
				list.add(new ImportedProduct(name, price, cf));
			}
			else {
				list.add(new Product(name, price));
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
