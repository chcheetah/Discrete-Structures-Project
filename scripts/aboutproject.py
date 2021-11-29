## this program defines the about window function that is used in the main program.
from tkinter import *
def abtprjct(names, rolls):
    about = Tk()
    d = len(names) * 90
    lmn = "300x"+str(d)
    print(lmn)
    about.geometry(lmn)
    about.resizable(0,0)
    about.title('About Program')
    Label(master = about, text = "\n Created By \n ").pack()
    for i in range(0, len(rolls)):
          f = '\n' + names[i] + '\t' + rolls[i] + '\n'
          Label(master = about, text = f).pack()
    about.mainloop()

## Just to check function in case you have doubts about functionality.

##eg = ['A','b','c','d','e']
##eg2 = ['2','3','4','5','55']
##abtprjct(eg, eg2)
