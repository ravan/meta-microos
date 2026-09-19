SUMMARY = "Count the number of primes"
DESCRIPTION = "primecount is a command-line program that counts the primes below an \
integer x ≤ 10^31 using highly optimized implementations of the \
combinatorial prime counting algorithms."
LICENSE = "BSD-2-Clause"

PV = "8.7"

RPM_NAME = "primecount-8.7-1.1.aarch64.rpm"
RPM_HASH = "2d9e3e1749abfd0eeec41c16341408578e3ddf6988915857bfcc07c3c3ed6d7902c787a9a62329fc518c2afc7fff76c0867fa5f64bdb3d9aed119cf58d7df78d"

RPROVIDES:${PN} += "primecount"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libprimecount.so.8 \
libprimesieve.so.12 \
libstdc++.so.6"

inherit rpm
