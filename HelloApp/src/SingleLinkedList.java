public class SingleLinkedList<E> {

    E data;
    SingleLinkedList<E> next;

   public SingleLinkedList(){};
   
   public SingleLinkedList(E data){
       this.data =data;
   }

    public SingleLinkedList(E data, SingleLinkedList next ){

        this.data =data;
        this.next= next;
    }

    @Override
    public String toString() {
        return data + "";
    }

    


    
}
