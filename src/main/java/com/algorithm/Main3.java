package com.algorithm;

public class Main3 {

    public static void main(String[] args) {
        BinarySearchTree trie = new BinarySearchTree();
        trie.insert(10);
        trie.insert(3);
        trie.insert(5);
        trie.insert(3);
        trie.insert(3);
        trie.insert(4);
        trie.insert(5);
        trie.find(3);
    }
}
