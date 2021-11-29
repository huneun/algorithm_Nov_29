package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �ڷᱸ���� ���ǿ�
		 * ���ذ� �ȵǸ� ū������ �����ϰ� �Ѿ�� �ٽ� Ȯ���غ���
		 * 
		 * ���(node)�� �귻ġ(branch)
		 * ���� ��带 �մ� �귻ġ�� ������ ġ�� ������� �ڷḦ �����ϴ� ������ tree �����̴�.
		 * ������ �����·� �پ� ���� �ʵ��� Ư���� ����Ŭ�� �̷��� �ʵ��� ����
		 * 
		 * �̹����� ����Ʈ������(binary tree)�� �˾ƺ���. �˻�, Ž�� �˰���
		 * ���� �ڷḦ �����ϴ� �����̰� �귻ġ�� ������ ������ �ִ�
		 * �ֻ�� ��带 rootNode��� �θ���.
		 * ����Ʈ����� �̸��� ���� �������� ���� ���� �귻ġ�� �ִ� 2��(��带 �������� 0Level~2Level �̶�� �θ���. �ִ� Level�� depth��� �Ѵ�.)�̱� ������ �ҷ��� �̸��̴�. 
		 * 
		 * ����Ʈ�� �߿����� Binary Search Tree��� �Ҹ���� Ʈ���� �ִ�.
		 * ����Ʈ���� ���������� branch�� �ִ� 2���̴�.
		 * ������ ���� ���� ������ ���� ��Ģ�� ������ ���Ǵµ�,
		 * ���� ���� �ش� ��庸�� ���� ��, ������ ���� �ش� ��庸�� ū���� ������ �ִ�.
		 * 
		 * �ΰ��� ���� ����Ǿ� �ִ� ���� ���� parent node��� �Ҹ���. �Ʒ� �ΰ��� ���� child node��� �θ���.
		 * ���� �θ� �ؿ� �ִ� child node ������ ���̸� sibilngs(Brother Node)��� �Ҹ���.
		 * 
		 * child node�� ���� node�� Leaf Node �Ǵ� Terminal Node��� �θ���.
		 * 
		 * */
		
		NodeMgmt tree = new NodeMgmt();
		
		tree.insertNode(51);
		tree.insertNode(12);
		tree.insertNode(1);
		//tree.insertNode(85);
		
		System.out.println("insert tree : "+tree.insertNode(85));

	}

}
