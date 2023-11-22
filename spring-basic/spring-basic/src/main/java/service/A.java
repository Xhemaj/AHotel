package service;

import com.basic.model.Leter;

public class A implements AlphabetLeter{



@Override
public Leter getLeterInformation(){
    return new Leter(info:"Une jam karakteri A",position:1);
}
}
