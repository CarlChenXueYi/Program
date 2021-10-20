tic
arr = [];
for i=1:10
    t1=toc;
    sum=0;
    for i=1:10000
        sum=sum+i;
    end
    t2=toc;
    arr=[a,t2-t1];
end
arr