package com.game.load.load.impl;

import java.util.Observable;
import java.util.Observer;
import com.game.load.TimeApart;
import com.game.load.PictureShow;
import com.game.load.AdapterPic;


public class SceneObserve extends Scene implements Observer{

	@Override
	protected void timeManagement() {
		// TODO Auto-generated method stub
       TimeApart timeApart=new TimeApart();
	}

	@Override
	protected void manipulationMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void worldMap() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void backgroundPicture() {
		// TODO Auto-generated method stub
        PictureShow picShow=new AdapterPic(1,1,"a");
        System.out.println("pictureShow");
	}

	@Override
	protected void backgroundMusic() {
		// TODO Auto-generated method stub
        System.out.println("musicShow");
	}
	
	public void update(Observable o, Object arg) {
		this.backgroundPicture();
		this.backgroundMusic();
	}

}
