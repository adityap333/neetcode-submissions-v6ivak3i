class BankAccount:
    # Class attributes - shared by ALL accounts
    total_accounts = 0
    total_balance = 0

    def __init__(self, name: str, balance: int) -> None:
        # Instance attributes - unique to each object
        self.name = name
        self.balance = balance

        # Update shared class attributes
        BankAccount.total_accounts += 1
        BankAccount.total_balance += balance


# Create accounts
alice = BankAccount("Alice", 1000)
bob = BankAccount("Bob", 2000)


print(f"Alice's balance: ${alice.balance}")
print(f"Bob's balance: ${bob.balance}")
print(f"Total Accounts: {BankAccount.total_accounts}")
print(f"Total Balance: ${BankAccount.total_balance}")