import java.awt.*;
import java.awt.event.*;
class Demo extends Frame implements ActionListener 
{
	TextArea tf;
	MenuBar mb;
	Menu File,Edit;
	MenuItem New ,Open,Save,Cut,Copy;
	FileDialog Fd;
	Demo()
	{
		super("Notepad");
		setLayout(new BorderLayout());
		tf = new TextArea();
		add(tf);
		mb = new MenuBar();
		File = new Menu("File");
		Edit = new Menu("Edit");
		New = new MenuItem("New");
		Open = new MenuItem("Open");
		Save = new MenuItem("Save");
		Cut = new MenuItem("Cut");
		Copy = new MenuItem("Copy");
		File.add(New);
		File.add(Open);
		File.addSeparator();
		File.add(Save);
		Edit.add(Cut);
		Edit.add(Copy);
		mb.add(File);
		mb.add(Edit);
		setMenuBar(mb);
		New.addActionListener(this);
		setSize(600,300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae)
	{
			Fd = new FileDialog();
			Fd.getDirectory();
	}
	
}
class Notepad
{
	public static void main(String args[])
	{
		new Demo();
	}
}
