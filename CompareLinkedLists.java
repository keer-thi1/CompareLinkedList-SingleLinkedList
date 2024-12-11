import java.util.*;
class SLL 
{
    int data;
    SLL next;
    SLL(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class CompareLinkedLists 
{
    public static int compareLists(SLL list1, SLL list2)
    {
        while (list1 != null && list2 != null)
        {
            if (list1.data != list2.data) 
            {
                return 0;
            }
            list1 = list1.next;
            list2 = list2.next;
        }
        if (list1 == null && list2 == null) 
        {
            return 1;
        } else 
        {
            return 0;
        }
    }
    public static SLL createList(int[] values)
    {
        if (values.length == 0) return null;
        SLL head = new SLL(values[0]);
        SLL current = head;
        for (int i = 1; i < values.length; i++) 
        {
            current.next = new SLL(values[i]);
            current = current.next;
        }
        return head;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int testCase = 0; testCase < t; testCase++)
        {
            int n = scanner.nextInt();
            int[] list1Values = new int[n];
            for (int i = 0; i < n; i++) 
            {
                list1Values[i] = scanner.nextInt();
            }
            SLL list1 = createList(list1Values);
            int m = scanner.nextInt();
            int[] list2Values = new int[m];
            for (int i = 0; i < m; i++) 
            {
                list2Values[i] = scanner.nextInt();
            }
            SLL list2 = createList(list2Values);
            System.out.println(compareLists(list1, list2));
        }
        scanner.close();
    }
}