package com.game.load.load;

import com.game.load.impl.UserMaster;
import com.game.load.impl.User;
import com.game.load.impl.UserWarrior;



public class UserFactory {
	public static IUser creator(int which){
		//getClass ����Sample һ���ʹ�ö�̬��װ��װ���ࡣ
		if (which==1)
			return new UserMaster();
		else if (which==2)
			return new UserWarrior();
		else 
			return new User();
		}
}
