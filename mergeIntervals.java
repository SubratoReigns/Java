/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        
        if(intervals.size() == 0 || intervals == null){
            return intervals;
        }
        
        else if(intervals.size() == 1){
            return intervals;
        }
        
        intervals.sort(new Comparator<Interval>() {
    @Override
     public int compare(Interval i1, Interval i2) {  //sorting two intervals wrt to starting point
         if(i1.start == i2.start){
             return 0;
         }
         return i1.start < i2.start ? -1 : 1;
     }
});

        int i = 0;
        Interval curr_Interval;
        Interval next_Interval;
        
        while(i < intervals.size() - 1){
            curr_Interval = intervals.get(i);
            next_Interval = intervals.get(i + 1);
            
            if(curr_Interval.end < next_Interval.start){   // leave intervals if they are non-overlapping
                i++;
            }
                                                          // if overlapping, merge them and update the curr_interval and remove next interval
            else{
                curr_Interval.start = Math.min(next_Interval.start, curr_Interval.start);
                curr_Interval.end = Math.max(next_Interval.end, curr_Interval.end);
                intervals.set(i, curr_Interval);
                intervals.remove(i + 1);
                
            }
        }
        
        return intervals;
    }
}
