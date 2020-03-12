package binary.com;

public class BinarySearchTree {
	public static class Node
	{
		static int rootnode;
	    int left;
	    int right;
		public Node(int value,int rightchildnode,int leftchildnode)
		{
			rootnode=value;
            left=leftchildnode;
            right=rightchildnode;
		}
	}
	public static Node root;
	public static boolean search(int data,int key)
	{
		if(data == key)
		{
		return true;
		}
		if(data > key)
		{
		    search(root.left,key);
		}
		else
		{
			search(root.right,key);
		}
		return false;
	}
	public static void main(String[] args)
	{
		int[] BinarySearchTree={1,2,3,4,5,6,10,12,13};
		System.out.println(BinarySearchTree[2]);
	}
}
		