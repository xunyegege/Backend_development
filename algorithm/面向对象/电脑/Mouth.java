/*
        _                         _             
                                        (_)                       | |            
                     __ _   __ _ __   __ _  _ __    ___  ___    __| |  ___  _ __ 
                    / _` | / _` |\ \ / /| || '_ \  / __|/ _ \  / _` | / _ \| '__|
                   | (_| || (_| | \ V / | || | | || (__| (_) || (_| ||  __/| |   
                    \__, | \__,_|  \_/  |_||_| |_| \___|\___/  \__,_| \___||_|   
                     __/ |                                                       
                    |___/  


*/

package 面向对象.电脑;

public class Mouth  implements TurnOnOff{
    @Override
    public String TurnOn() {
        return "国产鼠标已连接";
    }

    @Override
    public String TurnOff() {
        return "国产鼠标已断开连接";
    }
}
