package com.game.load.load;

public class AdapterPic extends PictureShow {
    private PictureShowThird third;
    int duibi,baohe;
    String pic;
       
    public AdapterPic(int duibi,int baohe,String pic){
          this.duibi=duibi;
          this.baohe=baohe;
          this.pic=pic;
    }
    
       @Override
     public int picture(int time , String pic) {
   		// TODO Auto-generated method stub
           third=new PictureShowThird();
    	   return third.pictureThird(duibi,baohe , pic);
   	}
}
