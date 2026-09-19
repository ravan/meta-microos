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

RPM_NAME = "python313-pyprimes-0.2.2a-2.5.noarch.rpm"
RPM_HASH = "cb598a9e054306b8b28aa2a323578b81ae8d19361c73a3fbf1d9ee67e9f211186dd87b2a96617ea35808312f6bde3392f8fa091299449890682cf8c89fc3fc3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyprimes \
python3.13dist-pyprimes \
python313-pyprimes \
python3dist-pyprimes"

RDEPENDS:${PN} += "python-abi"

inherit rpm
