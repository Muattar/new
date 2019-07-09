package AbstractionIntro;

public class FileTests {
     
	public static void main(String[] args) {
		
		//File f1 = new File(); will not work, cannot create object
		
		XLSFile xl = new XLSFile();
		xl.open();
		xl.close();
		xl.setName("TestData.xls");
		System.out.println("XLS file name: " + xl.getName());

		System.out.println("============================");
		
		JPGFile jp = new JPGFile();
		jp.setName("Event01.jpg");;
		jp.close();
		jp.open();
		System.out.println("JPG file name: " + jp.getName());
		
		System.out.println(File.count);
		System.out.println(JPGFile.count);
		System.out.println(XLSFile.count);
		
		PDFFile pd = new PDFFile("AgileBook.pdf");
		pd.open();
		pd.close();
		
		
		System.out.println(File.count);
		System.out.println(PDFFile.count);
		
	}
	
}
