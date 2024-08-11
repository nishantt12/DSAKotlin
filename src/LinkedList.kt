class LinkedList {

    var head: ListNode? = null
    public fun addNode(value: Int){
        val newNode = ListNode(value)
        if(head == null){
            head = newNode
        } else {

            newNode.next = head
            head = newNode
        }
    }

}