SUMMARY = "Generate and test for prime numbers"
DESCRIPTION = "The pyprimes package offers a variety of algorithms for generating prime \
numbers and fast primality tests, written in pure Python. \
 \
Prime numbers are those positive integers which are not divisible exactly \
by any number other than itself or one. Generating primes and testing for \
primality has been a favourite mathematical pastime for centuries, as well \
as of great practical importance for encrypting data. \
 \
``pyprimes`` includes the following features: \
 \
    - Produce prime numbers lazily, on demand. \
    - Effective algorithms including Sieve of Eratosthenes, Croft Spiral, \
      and Wheel Factorisation. \
    - Efficiently test whether numbers are prime, using both deterministic \
      (exact) and probabilistic primality tests. \
    - Examples of what *not* to do are provided, including naive trial \
      division, Turner's algorithm, and primality testing using a \
      regular expression. \
    - Factorise small numbers into the product of prime factors. \
    - Suitable for Python 2.4 through 3.x from one code base."
LICENSE = "MIT"

PV = "0.2.2a"

RPM_NAME = "python314-pyprimes-0.2.2a-2.5.noarch.rpm"
RPM_HASH = "0dcc8c000ea321a733c82d711d0008a9ff24a5eee973de62f4165e7bb924ca0d0206f3921a20b035def4c63dbea9ab6e93f3f61e0c8f4a319ff32eb1605fbc88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyprimes \
python314-pyprimes \
python3dist-pyprimes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
