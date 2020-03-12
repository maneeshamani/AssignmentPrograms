package binary.com;

public class BinarySearch {
	public boolean search(int[] sorted,int value,int leftIndex,int rightIndex)
	{
		if(leftIndex > rightIndex)
		{
			return false;
		}
		int middleIndex = (rightIndex + leftIndex)/2;
		if(sorted[middleIndex] > value)
		{
			return search(sorted,value,leftIndex,middleIndex-1);
		}
		if(sorted[middleIndex] < value)
		{ 
			return search(sorted,value,middleIndex+1,rightIndex);
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args)
	{
		int[] BinarySearchTree={1,2,3,4,5,6,10,12,13};
		System.out.println(BinarySearchTree[2]);
	}
}
