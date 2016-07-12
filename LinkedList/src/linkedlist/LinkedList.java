/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author LamLeePC
 */
public class LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node listNode = new Node(); // Cap phat bo nho cho listNode
        System.out.println(listNode);

    }

    private void insertBegin(Node node, int x) {
        Node q = new Node(); //Khoi tao node q
        q.next = node; // Gan dia chi cua node cho q.net
        q.item = x; // Gan gia tri cho q
        node = q; // tro lien ket phan tu dau tien la q
    }

    private void insertEnd(Node node, int x) {
        Node q = new Node(); // Khoi tao node
        Node r = new Node();
        q.next = null;
        q.item = x;
        if (node == null) {
            node = q;
        } else {
            r = node;
            while (r.next != null) {
                r = r.next;
            }
            r.next = q;
        }
    }

    private void insert(Node node, int position, int x) {
        int count = 1, found = 0;
        Node r = new Node();
        r = node;
        while ((r != null) && (found == 0)) {
            if (count == position) {
                Node q = new Node();
                q.item = x;
                q.next = r.next;
                r.next = q;
                found = 1;
            }
            count ++;
            r = r.next;
        }
        if (found == 0) {
            System.out.println("Khong tim thay vi tri can chen");
        }
    }
    
    private void deleteBegin(Node node) {
        if (node != null) {
            Node q = new Node();
            q = node;
            node = node.next;
            q.next = null;
        }
    }
    
    private void deleteEnd(Node node) {
        Node q = new Node();
        Node r = new Node();
        if (node == null) return;
        if (node.next == null) {
            deleteBegin(node);
            return;
        }
        r = node;
        while (r.next != null) {
            q = r;
            r = r.next;
        }
        q.next = null;
    }
    
    private void deleteMiddle(Node node, int position) {
        int count = 1, found = 0;
        Node q = new Node();
        Node r = new Node();
        r = node;
        while ((r != null) && (found == 0)) {
            q = r.next;
            r.next = q.next;
            q.next = null;
            found = 1;
        }
        count ++;
        r = r.next;
        if (count == 0) {
            System.out.println("Khong tim thay bo nho can xoa");
        }
    }
}
