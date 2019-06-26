import java.util.*;
 class Document 
{
	private String text;

	public Document(String textDoc)
	{
		setText(textDoc);
	}
	public void setText(String newTextDoc) 
	{
		text = newTextDoc;
	}
	public String toString()
	{
		return text;
	}
}
class Email extends Document 
{
	private String sender;
	private S String title;
tring recipient;
	private
	public Email(String textDoc, String senderMsg, String recipientMsg, String titleMsg) 
	{

		super(textDoc);
		sender = senderMsg;
		recipient = recipientMsg;
		title = titleMsg;
	}

	public String getSender()
	{
		return sender;
	}

	public String getRecipient() 
	{
		return recipient;
	}

	public String getTitle() 
	{
		return title;
	}

	public String gettext()
	{
		return super.toString();
	}

	public void setSender(String newSenderMsg)
	{
		sender = newSenderMsg;
	}

	public void setRecipient(String newRecMsg)
	{
		recipient = newRecMsg;
	}

	public void setTitle(String newTitleMsg) 
	{
		title = newTitleMsg;
	}

	public String toString() 
	{
		return "From: " + sender + "\nTo: " + recipient + "\n" + title + "\n\n" + super.toString();

	}
}
public class File extends Document 
{

	private String pathname;

	public File(String textMsg, String pathDes) 
	{
		super(textMsg);
		pathname = pathDes;
	}

	public String getPathname()
	{
		return pathname;
	}

	public String getText() 
	{
		return super.toString();
	}

	public void setPathname(String newPath)
	{
		pathname = newPath;
	}

	public String toString() 
	{
		return pathname + ": " + super.toString();
	}

	public static boolean ContainsKeyword(Document docObject, String keyword)
	{
		if (docObject.toString().indexOf(keyword, 0) >= 0)
			return true;

		return false;
	}

	public static void main(String args[]) 
	{
		String sample1 = "Java is Independent Programming language";
		String sample2 = "Overriding is done between super class and subclass";
		Document email1 = new Email(sample1, "james", "Malini", "adult");
		Document email2 = new Email(sample2, "siva", "Lucky", "animals");

		Document file1 = new File(sample1, "childrens.txt");
		Document file2 = new File(sample2, "animals.txt");
		String testWord = "Lucky";
		if (ContainsKeyword(email1, testWord))
			System.out.println("Email 1 contains the word " + testWord);
		else
			System.out.println("Email 1 does not contain " + "the word " + testWord);
		if (ContainsKeyword(email2, testWord))
			System.out.println("Email 2 contains the word " + testWord);
		else
			System.out.println("Email 2 does not contain" + " the word " + testWord);
		if (ContainsKeyword(file1, testWord))
			System.out.println("File 1 contains the word " + testWord);
		else
			System.out.println("File 1 does not contain" + " the word " + testWord);
		if (ContainsKeyword(file2, testWord))
			System.out.println("File 2 contains the word " + testWord);
		else
			System.out.println("File 2 does not contain" + " the word " + testWord);
		System.out.println("---");
		System.out.println(email1.toString());
		System.out.println("---");
		System.out.println(email2.toString());
		System.out.println("---");
		System.out.println(file1.toString());
		System.out.println(file2.toString());

	}
}