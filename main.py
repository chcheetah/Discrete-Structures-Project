from tkinter import *
from scripts.aboutproject import abtprjct
from scripts.importbinary import *
from scripts.searchbinary import *
from scripts.insertbinary import *
names = ["Harshiv Chandra", "Anish Srivastava", "Ashutosh Pandey"]
rolls = ["2020A7PS0085U","2020A7PS0058U","2020A7PS0237U"]
a = Tk()
a.geometry('450x200')
a.resizable(0,0)
a.title("Discrete Structures in Computer Science")
b = Label(master = a,text = "\n Welcome to the Binary Search Tree Project.\n")
c = Button(master = a, text = "Import Binary Tree from file.", command = lambda:importbin())
v = Label(text = "\n").pack()
d = Button(master = a, text = "Create New Binary Tree from scratch.", command = lambda:createbin)
e = Button(master = a, text = "About the project.", command = lambda:abtprjct(names, rolls))
b.pack()
c.pack()
d.pack()
e.pack()
a.mainloop()
