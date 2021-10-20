tic
arr = [];
for i=1:10
    t1 = toc;
    s=[3,4,1,8,0,5,14,10,12,20,23,24,2,17,6,18,9,19];
    s=bubble_sort(s);
    t2 = toc;
    arr = [arr,t2-t1];
end
arr


