package ch07;

public class MergeSort {

    int[] array;
    int[] tempMargeArr;
    int length;
    public static void main(String[] args) {

        int[] inputArr={82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        MargeSort ms=new MargeSort();
        ms .sort(inputArr);

        for(int i:inputArr){
            System.out.println(i+" ");
        }

    }
    public void sort(int inputArr[]){

        this.array=inputArr;
        this.length=inputArr.length;
        this.tempMargeArr=new int[length];
        divaideArray(0, length-1);
    }
    public void divaideArray(int lowerlndex, int higherlndex){

        if(lowerlndex<higherlndex){
            int middle=lowerlndex+(higherlndex-lowerlndex)/2;
            divaideArray(lowerlndex, middle);
            divaideArray(middle+1, higherlndex);
            margeArray(lowerlndex, middle, higherlndex);
        }

    }
    public void margeArray(int lowerlndek, int middle, int higherlndex){
        for(int i=lowerlndek; i<=higherlndex; i++){

            tempMargeArr[i]=array[i];
        }
        int i=lowerlndek;
        int j=middle+1;
        int k=lowerlndek;
        while(i<=middle && j<=higherlndex){

            if(tempMargeArr[i] <= tempMargeArr[j]){
                array[k]=tempMargeArr[i];
                i++;
            }
            else{
                array[k]=tempMargeArr[j];
                j++;
            }
            k++;
        }
        while(i<=middle){

            array[k]=tempMargeArr[i];
            k++;
            i++;
        }
    }
}

