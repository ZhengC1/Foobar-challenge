cat = None 
x = ["foo", "bar", "oof", "bar"]



dog = list(set(x))
print dog
count = 0
for i in x:
    if i == cat:
        x.remove(i)
    cat = i[::-1]

print len(list(set(x))) 
