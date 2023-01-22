import java.io.IOException;
import java.util.Scanner;

public class MainFunction {

		public static void MainFunction() {
			
			System.out.println("****************************************************");
			System.out.println("Select one of the options:");
			System.out.println("1.Fetch Artical Data");
			System.out.println("2.Fetch Section Data");
			System.out.println("****************************************************");
			
		}
		
		public static void main(String[] args) throws IOException, InterruptedException {
			
			 
			   
			// TODO Auto-generated method stub
			
			boolean MenuExit = true;
			
			
			while( MenuExit ) {
				Scanner sc = new Scanner(System.in);
				
			
			do {
				
				MainFunction();
				int SubMenue1 = sc.nextInt();
				switch(SubMenue1) {
				case 1:
					Artical articalObj=new Artical();
					articalObj.getData();
					
					 break;
					 
					
				case 2:
					Section sectionobj=new Section();
					sectionobj.getDataSection();
					
					break;
					
				
					
	    
	            
			}
				}while(true);

		}
			 MenuExit =false;
	}}

			


