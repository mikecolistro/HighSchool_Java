import sys

if sys.argv[1] == 'words.txt':
    list = open('words.txt','r')
    a = list.readlines()

    import random

    b = random.choice(a)

    print 'Welcome to Hangman'
    c = '_'*(len(b)-1)
    print c
    for i in range(1,6):
        mark = raw_input('Your guess: ')
        check = b.find(mark)
        if check != -1:
            print 'Succes!', mark, 'is in word at position', check
            c = c[:check] + mark + c[check + 1:]
            print c
        else:
            print 'Failure! You have tried tried %d times!' %(i)

else:
    print '[Errno2] No such file or directory: %s' %(sys.argv[1])
