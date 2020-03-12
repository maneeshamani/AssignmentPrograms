package binary.com;

public class SearchBinaryTree {
	public static class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public Node root;
	public static boolean flag=false;
	public SearchBinaryTree()
	{
		root=null;
	}
	public void SearchNode(Node temp,int value)
	{
		if(root==null)
		{
			System.out.println("temp is empty");
		}
		else
		{
			if(temp.data==value)
			{
				flag=true;
				return;
			}
			if(flag==false&&temp.right!=null)
			{
				SearchNode(temp.right,value);
			}
		}
	}
	public static void main(String[] args)
	{
		SearchBinaryTree bt=new SearchBinaryTree();
		bt.root=new Node(1);
		bt.root.left=new Node(2);
		bt.root.right=new Node(3);
		bt.root.left.left=new Node(4);
		bt.root.left.right=new Node(5);
		bt.root.right.right=new Node(6);
		bt.root.right.left=new Node(7);
		bt.SearchNode(bt.root,5);
		if(flag)
		{
			System.out.println("Element is present in the binary tree");
		}
		else
		{
			System.out.println("Element is noy present in the binary tree");
		}
	}
}