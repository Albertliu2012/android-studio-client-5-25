package com.androidbook.client;

/*
                                _oo8oo_
                               o8888888o
                               88" . "88
                               (| -_- |)
                               0\  =  /0
                             ___/'==='\___
                           .' \\|     |// '.
                          / \\|||  :  |||// \
                         / _||||| -:- |||||_ \
                        |   | \\\  -  /// |   |
                        | \_|  ''\---/''  |_/ |
                        \  .-\__  '-'  __/-.  /
                      ___'. .'  /--.--\  '. .'___
                   ."" '<  '.___\_<|>_/___.'  >' "".
                  | | :  `- \`.:`\ _ /`:.`/ -`  : | |
                  \  \ `-.   \_ __\ /__ _/   .-` /  /
              =====`-.____`.___ \_____/ ___.`____.-`=====
                                `=---=`
/**
* @time 2019/5/24 8:48 
* @version 1.00
* @author XingChen
*/
public interface  test {
    public void onClick();
}
class Dialo{
     abstract static class nidn {
        public abstract void onClick();
        public void st(){

        }
    }
}


class man{
    public static void main(){
        Dialo.nidn ni = new Dialo.nidn() {
            @Override
            public void onClick() {

            }
        };
    }
}