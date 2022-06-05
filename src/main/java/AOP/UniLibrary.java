package AOP;

import org.springframework.stereotype.Component;

@Component("uniLibrary")
public class UniLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("We get the book");
    }

}

