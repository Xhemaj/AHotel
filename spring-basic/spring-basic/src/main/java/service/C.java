package service;

import com.basic.model.Leter;

public class C implements AlphabetLeter{



    @Override
    public Leter getLeterInformation(){
        return new Leter(info:"Une jam karakteri C",position:3);
    }
