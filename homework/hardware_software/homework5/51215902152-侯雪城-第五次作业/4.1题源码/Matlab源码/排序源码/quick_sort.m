function s=quick_sort(s)
    if(length(s)>1)
        i=1;
        j=length(s);
        x=s(1);
        while(i<j)
            while(i<j&&s(j)>x)
                j=j-1;
            end
            if(i<j)
                s(i)=s(j);
                i=i+1;
            end
            while(i<j&&s(i)<x)
                i=i+1;
            end
            if(i<j)
                s(j)=s(i);
                j=j-1;
            end
        end
        s(i)=x;
        if (i>1)
            s(1:i-1)=quick_sort(s(1:i-1));
        end
        if (i<length(s))
            s(i+1:end)=quick_sort(s(i+1:end));
        end
    end
end

        
        