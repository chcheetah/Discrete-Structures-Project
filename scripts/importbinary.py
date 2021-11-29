## this subprogram is going to be used to import a binary search tree, stored in the format of bst
import glob, os
from tkinter import *

def importbin():
    def openfil():
        ds = int(sw.get())
        print(ds)
        try:
            swqa = lst[ds-1]
            awq = open(swqa, mode = 'r')
            qwe = awq.read()
            return qwe
        except IndexError:
            q = Tk()
            Label(q,text="Error, \n Given Selection doesnt exist!").pack()
            Button(q, text="Ok", command = lambda:q.destroy()).pack()
            q.mainloop()
    filelist = Tk()
    filelist.title("Import Binary Search Tree")
    Label(filelist,text="Choose file you want to open(Type its number down.)").pack()
    lst = []
    os.chdir("C:/DATA/Documents/Discrete Project/previous saves")
    i = 0
    for file in glob.glob("*.bst"):
        lst.append(str(file))
        i +=1
        Label(filelist,text = " <"+str(i)+ "> "+str(file)).pack()
    sw = Entry(filelist,text = "lol")
    fd = Button(filelist,text = "Continue",command=lambda:openfil())
    sw.pack()
    fd.pack()
    filelist.mainloop()

#importbin()
