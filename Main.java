class queue {
    int[] arr=new int[50];
    int ptr=-1;
    public int pop(){
        if(isempty()){
            return 0;
        }
        else {
            return arr[ptr--];

        }
    }
    public void push(int dd){
        if(ptr<49){
            arr[++ptr]=dd;
        }
        else 
            return;
    }
    public int peek(){
        return arr[ptr];
    }
    public boolean isempty() {
        return(ptr==-1);
    }
}
class change{
    public int convert(queue stack1,queue stack2,char func,int dd){
        if(func=='e'){
            stack1.push(dd);
        }
        else if(func=='d'){
            if(stack2.isempty()){
                while(!stack1.isempty()){
                    int da=stack1.pop();
                    stack2.push(da);
                }
            }
            return stack2.pop();
        }
        return 0;
    }
}
public class Main{
    public static void main(String[] args){
        queue stack1= new queue();
        queue stack2=new queue();
        change convert=new change();
        char e='e';
        char d='d';
        convert.convert(stack1,stack2,e,1);
        convert.convert(stack1,stack2,e,2);
        convert.convert(stack1,stack2,e,3);
        convert.convert(stack1,stack2,e,4);
        convert.convert(stack1,stack2,e,5);
       int r= convert.convert(stack1,stack2,d,0);
        int c=convert.convert(stack1,stack2,d,0);
        int t=convert.convert(stack1,stack2,d,0);
        int q=convert.convert(stack1,stack2,d,12);
        int b=convert.convert(stack1,stack2,d,12);
        System.out.println(r+""+c+""+t+""+q+""+b);
    }

}
