SUMMARY = "A prime number generator"
DESCRIPTION = "primesieve is a command-line program that generates primes using the \
sieve of Eratosthenes algorithm. It can generate primes and prime \
k-tuplets (twin primes, prime triplets, ...) up to 2^64 and find the \
nth prime."
LICENSE = "BSD-2-Clause"

PV = "12.15"

RPM_NAME = "primesieve-12.15-1.2.aarch64.rpm"
RPM_HASH = "a327d2673750da0dbfe8b4b042f6d7fb076cc99c1503f2260fe8a384a4125f7ad7de2f6ee6603158108b8ec3b149c06050231b189fe709032376c0df2e309a67"

RPROVIDES:${PN} += "primesieve"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprimesieve.so.12 \
libstdc++.so.6"

inherit rpm
