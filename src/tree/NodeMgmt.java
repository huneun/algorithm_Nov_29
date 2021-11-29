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
	 * Ʈ�� ������ ������ ���� ��찡 ����. 
	 * �׷��� ������ ����case�� ������ ����� �� ��츦 ������ �����Ͽ� ���⵵�� �ٿ�����
	 * 
	 * */
	
	public boolean insertNode(int data) {
		//case1 : Node�� �ϳ��� ���� ��
		if(this.head == null) {
			this.head = new Node(data);
		}else {
			//case2 : Node�� �ϳ� �̻� �� ���� ��
			Node findNode = this.head;//��Ȯ�� ��ġ�� ����� ����
			while(true) {
				//case2-1 : ���� Node�� ���� Node�� ���� �� ��
				if(data < findNode.value) {
					if(findNode.left != null) {
						findNode = findNode.left;
					}else {
						findNode.left = new Node(data);
						break;
					}
					
				}else {
					//case2-2 : ���� Node�� �����ʿ� Node�� ���� �� ��
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
