class CurrencyConverter:
    rates = {
        'EUR': 1.20,
        'JPY': 0.01
    }

    @staticmethod
    def to_usd(amount, currency):
        return amount * CurrencyConverter.rates[currency]


print(f"100 EUR = {CurrencyConverter.to_usd(100, 'EUR')} USD")
print(f"100 JPY = {CurrencyConverter.to_usd(100, 'JPY')} USD")