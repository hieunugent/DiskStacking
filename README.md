# DiskStacking
- given a non empty array of array where each subarray holds three integers and represent a disk.
- these integers denote each disk's width, depth, and height, respectively
- your goal is to stack up the disks and to maximize the total height of the stack
- a disk must have a strictly smaller width, depth, and height than any other disk below it 
- write a function that returns an array of disks in the final stack, starting with the top disk and ending with the bottom disk.
- note that you can't rotate disks; in other words, the integers in eaach subarray must represent [w, d, h] at all time

- disks = [[2,1,2],[3,2,3],[2,2,8],[2,3,4],[1,3,1],[4,4,5]]
- output= [[2,1,2],[3,2,3],[4,4,5]]

