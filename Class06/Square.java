package Class06;

import java.util.ArrayList;
import java.util.List;

public class Square extends Form {

    @Override
    public int calculateArea(int side) {
       return side * side;
    }

    List<Form> list = new ArrayList<>();
}

