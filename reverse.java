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
   
       public link reverse(link t){
        link current=t;
        link prev=null;
        while(current!=null) {
            link store=current.next;
            current.next=prev;
            prev=current;
            current=store;
        }
        return prev;
       }

       public link sort(linklist s,int k) {
         link dummy=new link(0);
        dummy.next=s.first;
        link current=dummy;
        link previousgroupend=dummy;
        link groupstart=dummy.next;
        link nextgroupstart=dummy.next;
        while(nextgroupstart!=null) {
            current=nextgroupstart;
            groupstart=current;
            for(int i=0;i<k-1&&current.next!=null;i++) {
              current=current.next;
            }      
            nextgroupstart=current.next;    
            current.next=null;
            previousgroupend.next=reverse(groupstart) ;
            previousgroupend=groupstart; 
        }
        return dummy.next;
       }
   }
   class main{
       public static void main(String[] args) {
           linklist point=new linklist();
           point.addlink(1);
           point.addlink(2);
           point.addlink(10);
           point.addlink(14);
           point.addlink(18);
           point.addlink(18);
         link head=point.sort(point,5);
           while(head!=null) {
            System.out.println(head.idata);
            head=head.next;
           }
       }
   }
   
    