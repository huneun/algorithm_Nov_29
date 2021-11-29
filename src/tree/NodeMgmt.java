package tree;

public class NodeMgmt {
	
	Node head = null;
	
	public class Node {
		Node left;
		Node right;
		int value;
		
		public Node(int data) {
			this.value = data;
			this.left = null;
			this.right = null;
		}
	}


	/**
	 * 트리 구조는 생각지 못한 경우가 많다. 
	 * 그렇기 때문에 보조case를 별도로 만들어 각 경우를 나누어 구현하여 복잡도를 줄여보자
	 * 
	 * */
	
	public boolean insertNode(int data) {
		//case1 : Node가 하나도 없을 때
		if(this.head == null) {
			this.head = new Node(data);
		}else {
			//case2 : Node가 하나 이상 들어가 있을 때
			Node findNode = this.head;//정확한 위치를 잡아줄 변수
			while(true) {
				//case2-1 : 현재 Node의 왼쪽 Node가 들어가야 할 때
				if(data < findNode.value) {
					if(findNode.left != null) {
						findNode = findNode.left;
					}else {
						findNode.left = new Node(data);
						break;
					}
					
				}else {
					//case2-2 : 현재 Node의 오른쪽에 Node가 들어가야 할 때
					if(findNode.right != null) {
						findNode = findNode.right;
					}else {
						findNode.right = new Node(data);
						break;
					}
				}
			}
		}
		return true;
		
	}
}
