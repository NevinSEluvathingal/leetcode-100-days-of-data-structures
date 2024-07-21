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
    public link sort(link l1,link l2) {
       /*  link newli=new link(0);
        link current1=l1;
        link current2=l2;
        int value1;
        int value2;
        while(current1!=null||current2!=null) {
            value1=(current1!=null)?current1.idata:100000;
            value2=(current2!=null)?current2.idata:100000;
            if(current1.idata<current2.idata) {
                newli.next=current1;
                current1=current1.next;
            }
            else {
                newli.next=current2;
                current2=current2.next;
            }

        }
        link current=newli.next;
        while(current!=null) {
            System.out.println(current.idata);
            current=current.next;
        }*/
        if(l1==null){
            return l2;
        }
        else if(l2==null) {
             return l1;  
        }
        link result;
        if(l1.idata<l2.idata) {
            result=l1;
            result.next=sort(l1.next,l2);
        }
        else {
            result=l2;
            result.next=sort(l1,l2.next);
        }
        return result;
    }
   }
   class main{
       public static void main(String[] args) {
           linklist point=new linklist();
           point.addlink(5);
           point.addlink(1);
   
           linklist point2=new linklist();
           point2.addlink(3);
           point2.addlink(2);
           link current=point2.sort(point.first,point2.first);
           while(current!=null) {
            System.out.println(current.idata);
            current=current.next;
           }
       }
   }
   
   