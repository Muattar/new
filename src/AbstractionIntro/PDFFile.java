package AbstractionIntro;

public class PDFFile extends File{

	//How do I call File (String name);
	//super() 
	
	public PDFFile(String name) {
		super(name);
	}
	
	
	@Override
	public void open() {
		System.out.println("Opening message PDFFile using Adobe Acrobat Reader");
		
	}

}
