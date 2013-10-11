package edu.csf.examen1.model;

import java.util.ArrayList;
import edu.csf.examen1.view.IWatcher;

public class Model {
	private ArrayList<IWatcher> watchers;
	
	public Model()
	{
		watchers = new ArrayList<IWatcher>();
	}
	
	public void addWatcher (IWatcher toAdd)
	{
		watchers.add(toAdd);
	}
}
