object Solution {
    def isValid(s: String): Boolean = {
        return resolve(s, "s") == "s"
    }
    
    def resolve(s: String, stack: String): String = {
        if (s.isEmpty) stack
        else s.head match {
            case ')' => if (stack.last == '(') resolve(s.tail, stack.init) else "f"
            case ']' => if (stack.last == '[') resolve(s.tail, stack.init) else "f"
            case '}' => if (stack.last == '{') resolve(s.tail, stack.init) else "f"
            case c => resolve(s.tail, stack + c)
        }
    }
}
