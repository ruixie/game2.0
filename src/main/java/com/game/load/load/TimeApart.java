package com.game.load.load;
import java.util.Observable;

public class TimeApart extends Observable{
    private int Time;

	public int getTime() {
		return Time;
	}

	public void setTime(int time) {
		Time = time;
	}
	
	public void update(Observable o, Object arg) {

	      this.disPlayTime(this.getTime());

	}

    private void disPlayTime(int Time) {

	      if ( Time==0||Time==8||Time==16) {

	           this.setChanged();

	           this.notifyObservers();

	       }
	      System.out.println("��ǰʱ����"+Time);
	    }

	}
