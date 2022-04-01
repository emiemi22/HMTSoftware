# UMTSoftware
Determination of numbers of rectangles that can be formed in a cartesian coordonate system, given some points (x,y).

First of all, we need at least 2 given points to determine an edge. If we know two points that can form an edge, it is easy to find another two point(those points have the same X or Y coordonate).

As a result the main idea of my solution is following:
- for each point(let's consider (x1,y1)) we try to determine if there is another point with (x2!=x1, y2!=y1). That means if those two points can form the diagonal of the rectangle.
- if we find a diagonal point, it is easy to check if there are 2 more points, because we know a coordonate from each point.
- if we find two point with the condition above accomplished, we have found a rectangle.
- don't forget to divide the result by 4, because a rectangle is formed by 4 points and we determine the diagonal for each of them.

To have an efficient solution I chose a tree data structure to store the points. Why? With this structure the search time is performed in O(log n). TreeSet in Java represents an self-balancing tree, so the height is log n (n - number of points). As a result we know for sure that in the worst case to find a point, it will take O(log n).
This solution suits for a large number of points and also it works on float coordonates.

Of course, if the number of points it is not too large, and if we have more memory, we can use a HashMap instead, or even a matrix. But overall those solutions won't be as efficient as the Tree one.
