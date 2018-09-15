from random import randint


def rps():
    global computer
    x = (input("please select: Rock(r)/Paper(p)/Scissors(s): ")).lower()

    chosen = randint(1, 3)

    if chosen == 1:
        computer = 'r'
    elif chosen == 2:
        computer = 'p'
    elif chosen == 3:
        computer = 's'

    if x == computer:
        print("DRAW... Huh !")
    elif x == 'r' and computer == 's':
        print("You wins")
    elif x == 'r' and computer == 'p':
        print("Computer Wins")
    elif x == 'p' and computer == 'r':
        print("You Win")
    elif x == 'p' and computer == 's':
        print("Computer Wins")
    elif x == 's' and computer == 'r':
        print("Computer Win")
    elif x == 's' and computer == 'p':
        print("You Wins")

    return x, 'vs', computer


print(rps())
answer = "yes"
while answer == 'yes':
     rps()
     answer = input("Play again? Yes/No? ")