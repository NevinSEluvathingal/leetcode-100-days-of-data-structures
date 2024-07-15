import java.util.HashMap;
import java.util.Map;

class link {
    public int idata;
    link next;  
    
    public link(int dd) {
       idata=dd;
    }
    public void display() {
       System.out.println(idata+" ");
    }
   }
   class linklist {
       link first;
       public int sum;
       
       public linklist() {
           first=null;
       }
   
       public void addlink(int dd) {
           link newlink=new link(dd);
           newlink.next=first;
           first=newlink;
       }
       public link deletelink(int dd) {
           link current=first;
           link previous=first;
           while(current.idata!=dd) {
               if(current.next==null){
                   return null;             
               }
               else {
                   current=current.next;
                   previous=current;
               }
           }
           if(current==first){
               first =current.next;
           }
           else{
               previous.next=current.next;
           }
           return current;
           
       }
       public void displaylist() {
           link current=first;
           while (current!=null) {
               System.out.println(current.idata);
               current=current.next;
           }
       }
   
       public void dupe(){
        link current=first;
        Map<Integer,Integer> map=new HashMap<>();
        link previous=first;
        while(current!=null) {
            if(map.containsKey(current.idata)){
                previous.next=current.next;
            }
            else
                map.put(current.idata, null);
            previous=current;
            current=current.next;
        }
       }
   }
   class main{
       public static void main(String[] args) {
           linklist point=new linklist();
           point.addlink(1);
           point.addlink(2);
           point.addlink(10);
           point.addlink(10);
           point.addlink(14);
           point.addlink(18);
           point.addlink(18);
           point.displaylist();
           point.dupe();
           point.displaylist();
       }
   }
   
   