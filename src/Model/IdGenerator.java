package Model;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {
    private static final AtomicInteger idGenerator = new AtomicInteger(1);
    private final Integer id;
    public IdGenerator(){id = idGenerator.getAndIncrement();}
    public int getId(){return id;}
}
