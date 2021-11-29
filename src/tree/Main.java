package tree;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 자료구조의 끝판왕
		 * 이해가 안되면 큰개념을 이해하고 넘어가서 다시 확인해보자
		 * 
		 * 노드(node)와 브렌치(branch)
		 * 노드와 노드를 잇는 브렌치가 가지를 치는 모양으로 자료를 저장하는 구조가 tree 구조이다.
		 * 가지는 고리형태로 붙어 있지 않듯이 특정한 사이클을 이루지 않도록 구성
		 * 
		 * 이번에는 이진트리구조(binary tree)를 알아보자. 검색, 탐색 알고리즘
		 * 노드는 자료를 저장하는 공간이고 브렌치의 정보도 가지고 있다
		 * 최상단 노드를 rootNode라고 부른다.
		 * 이진트리라는 이름의 뜻은 상위노드로 가기 위한 브렌치가 최대 2개(노드를 기준으로 0Level~2Level 이라고 부른다. 최대 Level을 depth라고 한다.)이기 때문에 불려진 이름이다. 
		 * 
		 * 이진트리 중에서도 Binary Search Tree라고 불리우는 트리가 있다.
		 * 이진트리와 마찬가지로 branch가 최대 2개이다.
		 * 하지만 왼쪽 노드와 오른족 노드는 규칙을 가지고 사용되는데,
		 * 왼쪽 노드는 해당 노드보다 작은 값, 오른쪽 노드는 해당 노드보다 큰값을 가지고 있다.
		 * 
		 * 두개의 노드와 연결되어 있는 상위 노드는 parent node라고 불린다. 아래 두개의 노드는 child node라고 부른다.
		 * 같은 부모 밑에 있는 child node 끼리의 사이를 sibilngs(Brother Node)라고 불린다.
		 * 
		 * child node가 없는 node를 Leaf Node 또는 Terminal Node라고 부른다.
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
