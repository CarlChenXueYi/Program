function s=bubble_sort(s)
    temp=0;
    len=length(s);
    for i=1:len
        for k=1:len-i
            if s(k)>s(k+1)
                temp=s(k);
                s(k)=s(k+1);
                s(k+1)=temp;
            end
        end
    end
end