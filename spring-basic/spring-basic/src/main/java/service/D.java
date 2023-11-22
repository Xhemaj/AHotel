package service;

import com.basic.model.Leter;

public class D implements AlphabetLeter{



    @Override
    public Leter getLeterInformation(){
        return new Leter(info:"Une jam karakteri D",position:4);
    }
