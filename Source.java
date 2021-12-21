import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
public class test01
{
    public static void main(String[] args) throws InterruptedException
    {
        Scanner tmp = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);
        System.out.println("BYE WORLD!");
        //String name = tmp.nextLine();
        
        System.out.println("Nhap so luong phan tu: ");
        int n = tmp.nextInt();
        ArrayList<String> a = new ArrayList<String>();
        // a.add("Red");
        // a.add("Yellow");
        // a.add("Pink");
        // a.add("Green");
        //=======================================================
        //Array list in Java
        //Input data into ArrayList
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Nhap pt thu " + i + " : ");
            String str = tmp.next();
            a.add(str);
        }
        int chon;
        //Show ArraryList
        do{
            //System.out.println("1. Truy cap vao vi tri\n2. Thay doi phan tu\n3. Xoa phan tu");
            clearConsole();
            menu();
            System.out.print("\nChon: ");
            chon = tmp.nextInt();
            switch(chon)
            {
                case 1:
                {
                    System.out.println(a);
                    //Access an item
                    System.out.println("Nhap vi tri: ");
                    n = tmp.nextInt();
                    System.out.println("\nPhan tu nam o vi tri " + n + " la: "+ a.get(n));
                    break;
                }
                case 2:
                {
                    //Change an item
                    System.out.println(a); 
                    System.out.print("Nhap vi tri can thay doi: "); 
                    n = tmp.nextInt(); 
                    System.out.print("Nhap gia tri: "); 
                    String str = tmp.next(); 
                    a.set(n, str); 
                    System.out.println(a); 
                    break;
                }
                case 3:
                {
                    //Remove an item
                    System.out.println(a);
                    System.out.print("Nhap vi tri can xoa: ");
                    n = tmp.nextInt();
                    if(n > a.size() || n < 0)
                    {
                        System.out.println("Vi tri "+ n + " khong ton tai!");
                    }
                    else
                    {
                        a.remove(n);
                    }                 
                    System.out.println(a);
                    break;
                }
                case 4:
                {
                    //Remove all
                    System.out.println(a);
                    System.out.print("Xoa toan bo ArrayList...");
                    a.clear();
                    System.out.println(a);
                    break;
                }
                case 5:
                {
                    //Check Size
                    System.out.println(a);
                    System.out.println("Kich thuoc cua ArrayList hien tai: "+ a.size());
                    break;
                }
                default:
                {
                    System.out.println("EXIT!");
                    break;
                }
            } 
            pause.nextLine();
            //Thread.sleep(2000);       
        }while(chon > 0 && chon <= 10);
    
    }
    public static void menu()
    {
        System.out.println("===============================================\n");
        System.out.println("                       -Menu-                  ");
        System.out.println("                1. Truy cap vao vi tri         ");        
        System.out.println("                2. Thay doi phan tu            ");    
        System.out.println("                3. Xoa phan tu                 ");
        System.out.println("                4. Xoa toan bo                 ");
        System.out.println("                5. kich thuoc ArrayList        ");        
        System.out.println("                6.                             ");
        System.out.println("===============================================");
    }
    public final static void clearConsole()  
    {  
        try  
        {  
        final String os = System.getProperty("os.name");  
            if (os.contains("Windows"))  
            {  
                Runtime.getRuntime().exec("cls");  
            }  
            else  
            {  
                Runtime.getRuntime().exec("clear");  
            }  
        }  
        catch (final Exception e)  
        {  
        e.printStackTrace();  
    }  
    }  
    // public static void menu()//Đọc file 
    // {
    //     try {
    //         File myObj = new File("C:/Users/Asus/OneDrive - Ho Chi Minh city University of Food Industry/Workspace/Java/menu.txt");
    //         Scanner myReader = new Scanner(myObj);
    //         while (myReader.hasNextLine()) {
    //           String data = myReader.nextLine();
    //           System.out.println(data);
    //         }
    //         myReader.close();
    //       } catch (FileNotFoundException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //       }
    // }
}
