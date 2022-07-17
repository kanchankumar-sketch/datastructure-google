package arrays;

import java.util.stream.IntStream;

public class PetrolPump {
    public static void main(String[] args) {
        //fuel get a=[2,6,5,4,6,5,6,8,4,9];
        //fue; expense for i to i+1=b[i]  b=[5,6,4,8,6,5,3,9,4,9];
        int GF[]={2,6,5,4,6,5,6,8,4,9};
        int EF[]={5,6,4,8,6,5,3,9,4,9};

        System.out.println(PetrolPump.test2(GF,EF));

    }

    public static int test(int GF[],int EF[]){
        int available=0;
        int i=0;
        while(true){
            available=(GF[i]-EF[i])+available;
            if(available<0){
                return -1;
            }
            i++;
            if(i> GF.length){
                i=0;
            }

        }
       // return -1;
    }

    public static int test2(int gas[],int cost[]){
      /*  def gas_station(gas, cost):
        remaining = 0
        candidate = 0
        for i in range(len(gas)):
        remaining += gas[i] - cost[i]
        if remaining < 0:
        candidate = i + 1
        remaining = 0
        prev_remaining = sum(gas[:candidate]) - sum(cost[:candidate])
        if candidate == len(gas) or remaining + prev_remaining < 0:
        return -1
    else :
        return candidate*/

        int remaining = 0;
        int candidate=0;
        for (int i = 0; i<gas.length;i++)
        {
            remaining += gas[i]-cost[i];
            if(remaining<0){
                candidate=i+1;
                remaining=-0;
                int prev_remaining= IntStream.range(0,candidate-1).map(x->gas[x]).sum()+IntStream.range(0,candidate-1).map(x->cost[x]).sum();
                if(candidate==gas.length || remaining+prev_remaining<0){
                    return -1;
                }else{
                    return gas[candidate];
                }
            }
        }
        return -1;
    }
}
