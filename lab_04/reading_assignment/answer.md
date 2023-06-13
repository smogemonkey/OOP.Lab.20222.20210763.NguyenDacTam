* Question: If the passing object is not an instance of Media, what happens ?

* Answer: If the object is based on a subtype of Media, such as Book, for example, the code will compile normally. Otherwise, it will yield an error

* Alternatively, to compare items in the cart, instead of using Comparator, we can use the Comparable interface and override the compareTo()method.

* Suppose we are taking this Comparable interface approach. 

* Q:What class should implement the Comparable interface? 
* A:Media

* Q:In those classes, how should you implement the compareTo()method be to reflect the ordering that we want? 
* A:The compareTo() method should compare the fields that define the ordering we want.

* Q:Can we have two ordering rules of the item (by title then cost and by cost then title) if we use this Comparable interface approach? 
* A:Yes

* Q:Suppose the DVDs has a different ordering rule from the other media types, that is by title, then decreasing length, then cost. How would you modify your code to allow this? 
* A:
```java
@Override
public int compareTo(Media o) {
    int compareTitle = this.getTitle().compareTo(o.getTitle());
    if (compareTitle != 0) {
        return compareTitle;    
    }  
    
    // Compare lengths in descending order
    int compareLength = o.length - this.length;
    if (compareLength != 0) {
        return compareLength;
    }
    
    return Double.compare(this.getCost(), o.getCost());     
}      
```