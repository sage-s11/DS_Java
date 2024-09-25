Theory for trees  

IDENTICAL TREES  
------------------  
3 ways to verify  
[1] Using DFS – O(n) Time and O(n) Space  
[2] Using Level Order Traversal (BFS) – O(n) Time and O(n) Space  
[3] Using Morris Traversal – O(n) Time and O(1) Space  

Although Morris Traversal has efficient space complexity because it doesn't use recursion or a stack, it modifies the tree    
structure temporarily during the traversal, which may not always be ideal or desired.  
Moreover, Morris traversal has some overhead due to the creation and removal of threads (temporary pointers), which can make it   less intuitive or complex compared to other methods.  
