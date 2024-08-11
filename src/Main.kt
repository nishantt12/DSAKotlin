import java.util.Arrays

fun main(args: Array<String>) {

    println(validate(intArrayOf(1,2,3,4,5), intArrayOf(4,3,5,1,2)))

}

fun deleteDuplicates(head: ListNode?): ListNode? {

    var prev: ListNode? = null;

    var nonSame: ListNode? = null;

    var currentNode: ListNode? = head;

    while(currentNode!=null){
        while(prev?.`val` == currentNode?.`val`){
            prev = currentNode;
            currentNode = currentNode?.next;
        }
        if(nonSame!=null){
            nonSame.next = currentNode;
        }
        nonSame = currentNode;
        prev = currentNode;
        currentNode = currentNode?.next;
    }

    return head;

}