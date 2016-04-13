# Simple ElGamal Calculator
## Variables

Variable   |   description   |  get from
------------|---------------------|--------------
p | prime number | user's input
d | private key | user's input
e1 | public key 1 for encrypting ciphertext 1 – some article might use "G" | user's input
e2 | public key 2 for encrypting ciphertext 2 | calculation
c1 | ciphertext 1 | calculation
c2 | ciphertext 2 | calculation
r | random number - used in ciphertext encryption | user's input
t | Plaintext | user's input
td | text after decryption | calculation

_NOTE_ : plaintext – in real world, it might be translated from Unicode or other stuffs but for this simple calculator, I assume that it is already translated

## Example value
p | e1 | d | r | t
------|------|------|------|------
23 | 7 | 11 | 13 | 20
23 | 11 | 6 | 3 | 10
11 | 2 | 8 | 9 | 5

## Key Generating

> public key = (e1,e2,p)

p => user's input
e1 => user's input
e2 => (e1^d) mod p

> private key = (d)

d => user's input

## Encryption
1. Select random number r
2. encrypt plaintext to Ciphertext (C1,C2)

> C1 => (e1^r) mod p

> C2 => ((e2^r) * t) mod p

3. Send Ciphertext thru network

## Decryption

Decrypt Ciphertext using d (private key)

> td = (C2*(((C1^d)^-1)) mod p = (C2*(C1^(p-1-d))) mod p
