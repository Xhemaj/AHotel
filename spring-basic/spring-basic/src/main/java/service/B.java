package service;

import com.basic.model.Leter;

public class B  implements AlphabetLeter{



    @Override
    public Leter getLeterInformation(){
        return new Leter(info:"Une jam karakteri B",position:2);
    }