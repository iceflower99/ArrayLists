package lists.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	
	public ArrayListController()
	{
		firstWords= new ArrayList<String>();
	}
	
	public void start()
	{
		firstWords.add("fjewoadsuiefhiuf yaw;re au");
		firstWords.add("babababab");
	    showList();
	}
	
	private void showList()
	{
		for(int spot=0; spot<firstWords.size(); spot++)
		{
			JOptionPane.showMessageDialog(null,firstWords.get(spot)+ " ist at spot# " + spot);
		}
	}

}
