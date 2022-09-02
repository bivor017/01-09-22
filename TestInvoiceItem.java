package com.oops.pll;

import com.oops.bll.InvoiceItem;

public class TestInvoiceItem {

	public static void main(String[] args) {
		
		InvoiceItem i1 = new InvoiceItem("123Ac","Hard Disk_1tb", 2, 4000);
		
		System.out.println("ID :" +i1.getId());
		System.out.println("Description : "+i1.getDesc());
		System.out.println("Quantity :"+i1.getQty());
		System.out.println("unit Price : "+i1.getUnitPrice());
		System.out.println("Total : "+i1.getTotal());
		System.out.println("*******************************************");
		i1.setUnitPrice(4000);
		System.out.println("ToTal :" +i1.getTotal());
		System.out.println("********************************************");
		System.out.println(i1);

	}

}
