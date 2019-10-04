
 
package homework21;

import java.util.Scanner;


public class Homework21 {

    
    public static void main(String[] args) {
     


		
		Scanner a=new Scanner(System.in);
		
		String name;
		double price;
		int number;
		int promotion;
		int luxury;
		
		System.out.println("Enter name,price,number of purchases,promotion type and luxury");
		
		name=a.next();
		price=a.nextDouble();
		number=a.nextInt();
		promotion=a.nextInt();
		luxury=a.nextInt();
		
		double value=price*number;
		double purepayment=0;
		double totaldis=0; //Total discount made (before VAT is computed)
		double pt1=0; //Total discount made for promotion type 1
		double pt2=0; //Total discount made for promotion type 2
		double withoutVAT=0; //Total net paytmets after discouts without VAT
		double totaltax=0; //Total value added tax paid
		double nitem=0; //Total VAT paid for normal items
		double litem=0; //Total VAT paid for luxary items
		double totalPayment=0; //Total payment including VAT
		
		
		
		for(int i=0;i<10;i++) {
			
			if (price<0){
                            
                            break;
                        }
			
			
			purepayment=purepayment+value;
			
			switch(promotion) {
			
			case 0:value=price*number;
			break;
			
			case 1:
				
				if(value>40) {
				
				value=value-value*0.05;
				
				pt1=pt1+value*0.05;
			}
				break;
			
			
			case 2:if(number>2) {
				
				value=price*2+price*0.5*(number-2);
				
				pt2=pt2+price*0.5*(number-2);
			}
				
				break;
			
			
			default:
			break;
			}
			
			withoutVAT=withoutVAT+value;
			
			double VAT=0;
			
			if(luxury==0) {
				
				VAT=0.08;
				
				value=value+value*VAT;
				
				nitem=nitem+value*VAT;
				
				
			}else if (luxury==1){
				
				VAT=0.18;
				
				value=value+value*VAT;
				
				litem=litem+value*VAT;
				
				
				}
			
			System.out.println("You have to pay:"+value);
			
			totaldis=totaldis+pt1+pt2;
			totaltax=totaltax+nitem+litem;
			totalPayment=totalPayment+value;
			
			System.out.println("Enter name,price,number of purchases,promotion type and luxury");
			
			name=a.next();
			price=a.nextDouble();
			number=a.nextInt();
			promotion=a.nextInt();
			luxury=a.nextInt();
			
			
		}
		
		System.out.println("Total  payment without discounts and before VAT is"+ purepayment );
		System.out.println("Total discount made is"+ totaldis);
		System.out.println("Total discount made for promotion type 1 is"+ pt1);
		System.out.println("Total discount made for promotion type 2 is"+ pt2);
		System.out.println("Total net paytmets after discouts without VAT is"+ withoutVAT);
		System.out.println("Total value added tax paid is"+ totaltax);
		System.out.println("Total VAT paid for normal items is"+ nitem);
		System.out.println("Total VAT paid for luxury items is"+ litem);
		System.out.println("Total payment including VAT is"+ totalPayment);
		
				

	}


    }
    

