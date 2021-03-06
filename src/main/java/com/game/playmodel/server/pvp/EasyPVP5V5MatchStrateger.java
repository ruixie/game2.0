package com.game.playmodel.server.pvp;

import java.util.ArrayList;
import java.util.List;

import com.game.load.IUser;

/**
 * 战力匹配战法最简单实现
 * @author XR
 *
 */
public class EasyPVP5V5MatchStrateger implements IPVPMatchStrateger {

	public List<List<List<IUser>>> match(List<UserWithDetail> users) {
		List<List<List<IUser>>> results = new ArrayList<List<List<IUser>>>();
		while(users.size() >= 10){
			List<List<IUser>> result = new ArrayList<List<IUser>>();
			List<IUser> group1 = new ArrayList<IUser>();
			List<IUser> group2 = new ArrayList<IUser>();
			for(int i = 0; i < 10; i += 2){
				group1.add(users.get(i));
			}
			for(int i = 1; i < 10; i += 2){
				group2.add(users.get(i));
			}
			//从未匹配用户中删除以匹配用户
			for(int i = 0; i < 10; i++){
				users.remove(0);
			}
			result.add(group1);
			result.add(group2);
			results.add(result);
		}
		return results;
	}

}
