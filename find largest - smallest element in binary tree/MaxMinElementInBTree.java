public class MaxMinElementInBTree {

	public static int maxElementInBTree(Node root) {
		if (null == root)
			return Integer.MIN_VALUE;

		int currentNodeValue = root.data;
		int hLeftSub = maxElementInBTree(root.left);
		int hRightSub = maxElementInBTree(root.right);
		return Math.max(Math.max(hLeftSub, hRightSub), currentNodeValue);
	}

	public static int minElementInBTree(Node root) {
		if (null == root)
			return Integer.MAX_VALUE;

		int data = root.data;
		int left = minElementInBTree(root.left);
		int right = minElementInBTree(root.right);
		return Math.min(data, Math.min(left, right));
	}
}
