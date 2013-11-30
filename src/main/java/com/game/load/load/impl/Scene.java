package com.game.load.load.impl;

import com.game.base.IUnit;
import com.game.load.IScene;
import com.game.load.IUser;
import com.game.load.UserFactory;


/**
 * Created with IntelliJ IDEA.
 * User: xianliu.wy
 * Date: 13-11-26
 * Time: 下午8:20
 * To change this template use File | Settings | File Templates.
 */
public abstract class Scene implements IScene{
	private IUnit unit;
	private IUser npc;
	private IUser myUser;
	
	public IUnit getUnit() {
		return unit;
	}
	public void setUnit(IUnit unit) {
		this.unit = unit;
	}
	public IUser getNpc() {
		return npc;
	}
	public void setNpc(IUser npc) {
		this.npc = npc;
	}
	public IUser getMyUser() {
		return myUser;
	}
	public void setMyUser(IUser myUser) {
		this.myUser = myUser;
	}
	
	public final void load() {
        //To change body of implemented methods use File | Settings | File Templates.
    	timeManagement();
    	manipulationMenu();
    	worldMap();
    	backgroundPicture();
    	backgroundMusic();
    	allocUnit();
    }
    protected abstract void timeManagement();
    protected abstract void manipulationMenu();
    protected abstract void worldMap();
    protected abstract void backgroundPicture();
    protected abstract void backgroundMusic();
    
    protected void allocUnit(){
        npc=UserFactory.creator(3);
    	((User)npc).setUnit(unit);
    	
    	myUser=UserFactory.creator(1);
    	((User)myUser).setUnit(unit);
    }
}
