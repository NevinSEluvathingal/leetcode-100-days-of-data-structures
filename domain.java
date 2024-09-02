import java.util.*;

 class Domain {
    public static List<String> traffic(List<String> request) {
        List<String> response = new ArrayList<>();
        Map<String, Integer> five = new HashMap<>();
        Map<String, Integer> thirty = new HashMap<>();
        int timer1 = 0;
        int timer2 = 0;

        for (int i = 0; i < request.size(); i++) {
            String currentRequest = request.get(i);
            timer1++;
            timer2++;
 
           
            if (timer1 % 5 == 0) {
                timer1 = 0;
                five.clear();
            }
            if (timer2 % 30 == 0) {
                timer2 = 0;
                thirty.clear();
            }

           
            if (thirty.containsKey(currentRequest)) {
                int count30 = thirty.get(currentRequest);

             
                if (count30 < 6) {
                   
                    if (five.containsKey(currentRequest)) {
                        int count5 = five.get(currentRequest);

                        if (count5 < 2) {
                            response.add("status 200");
                            five.put(currentRequest, count5 + 1);
                        } else {
                            response.add("status 429");
                        }
                    } else {
                       
                        five.put(currentRequest, 1);
                        response.add("status 200");
                    }
                } else {
                    response.add("status 429");
                }

                
                thirty.put(currentRequest, count30 + 1);
            } else {
              
                thirty.put(currentRequest, 1);
                response.add("status 200");
            }
        }
        return response;
    }
}

class Main {
    public static void main(String[] args) {
        List<String> aad = List.of("www.xyz", "www.com", "www.cram", "www.xyz", "www.xyz", "www.xyz", "www.com", "www.xyz");
        List<String> response = Domain.traffic(aad);
        System.out.println(response);
    }
}
