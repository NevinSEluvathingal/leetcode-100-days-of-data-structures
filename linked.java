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

    public void add(linklist l1,linklist l2) {
        int carry=0;
        int val1,val2;
        linklist newarr=new linklist();
        link current1=l1.first;
        link current2=l2.first;
        while (current1!=null||current2!=null||carry>0) {
            val1=(current1!=null)?current1.idata:0;
            val2=(current2!=null)?current2.idata:0;
            sum=val1+val2+carry;
            carry=sum/10;
            newarr.addlink(sum%10);
            current1=current1.next;
            current2=current2.next;
        } 
        newarr.displaylist();
    }
}
class main{
    public static void main(String[] args) {
        linklist point=new linklist();
        point.addlink(1);
        point.addlink(2);
        point.displaylist();

        linklist point2=new linklist();
        point2.addlink(6);
        point2.addlink(5);
        point2.displaylist();
        point2.add(point,point2);
    }
}

