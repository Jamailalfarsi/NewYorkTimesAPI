import java.io.IOException;
import java.util.Scanner;

public class MainFunction {

		public static void MainFunction() {
			
			System.out.println("****************************************************");
			System.out.println("Select one of the options:");
			System.out.println("1.Fetch and insert Artical Data");
			System.out.println("2.Fetch and insert Section Data");
			System.out.println("3.Fetch and insert Authors Data");
			System.out.println("4.Add Column(section_id)Artical Table");
			System.out.println("5.Add Column(author_id)Artical Table");
			System.out.println("6:articles were published each month in the year 2021");
			
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
					
				case 3:
					authors authorsobj=new authors();
					authorsobj.getDataAuthors();
				case 4:
					ALTERTable alterTableObj=new ALTERTable();
					alterTableObj.ALTERTableFunction() ;
					
				case 5:
					ALTERTable alterTableObj2=new ALTERTable();
					alterTableObj2.ALTERTableFunction2() ;
					
				case 6:
					Published Publishedobj=new Published();
					Publishedobj.PublishedYear();
			}
				}while(true);

		}
			 MenuExit =false;
	}}

			


