SUMMARY = "Computation on Coxeter groups"
DESCRIPTION = "The Coxeter 3 C++ library can be used to do computation on and with \
 \
  * General Coxeter groups, implemented through the combinatorics of \
    reduced words; \
  * Reduced expression and normal form computations; \
  * Bruhat ordering; \
  * Ordinary Kazhdan-Lusztig polynomials; \
  * Kazhdan-Lusztig polynomials with unequal parameters; \
  * Inverse Kazhdan-Lusztig polynomials; \
  * Cells and W-graphs;"
LICENSE = "GPL-2.0-or-later"

PV = "3.1+git7"

RPM_NAME = "coxeter-3.1+git7-1.22.aarch64.rpm"
RPM_HASH = "6fe9c325dae21a1983b646a2f301815563a94246523fcad40c8199824661ab2a1f31659c5c0806fc4a4c8b681ab9219e2e7d7330550a1a8f7180900e1ace9e7b"

RPROVIDES:${PN} += "coxeter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
