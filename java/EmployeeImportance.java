/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int index = findId(employees, id);
        int importance = employees.get(index).importance;
        List<Integer> sub = employees.get(index).subordinates;
        // record parent value
        
        int total = importance;    
        return impRec(sub, employees, total);
        
    }
    
    public int impRec(List<Integer> sub, List<Employee> employees, int total) {
        for (int i = 0; i < sub.size(); i++) {
            // loop through all subordinates
            int index = findId(employees, sub.get(i));
            List<Integer> newSub = employees.get(index).subordinates;
            if (newSub.size() != 0) {
                // if there are subordinates, add those to the total
                total = impRec(newSub, employees, total);
            }
            // there are no more sub
            total += employees.get(index).importance;

            // add the current subordinate to the total
            
        }
        return total;
    }
    
    public int findId(List<Employee> emp, int id) {
        int i = 0;
        for (i = 0; i < emp.size(); i++) {
            if (emp.get(i).id == id) {
                return i;
            }
        }
        return i;
    }
}
