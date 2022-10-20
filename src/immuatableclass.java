 final class immuatableclass {
    private int i;
    //constructor
     public immuatableclass(int i) {
        this.i=i;
     }

     public immuatableclass modify(int i)
    {
        if(this.i==i)
        {
            return this;
        }
        else {
            return new immuatableclass(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("t1 and t3 are pointing to the same object");
        System.out.println("t1 and t2 are pointing to the different object");
        immuatableclass t1=new immuatableclass(10);
        immuatableclass t2=t1.modify(100);
        immuatableclass t3=t1.modify(10);
        System.out.println(t1==t2);
        System.out.println(t1==t3);
    }
}
