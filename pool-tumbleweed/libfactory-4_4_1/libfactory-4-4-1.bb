SUMMARY = "Singular's factorization library"
DESCRIPTION = "Factory is a C++ class library that implements a recursive \
representation of multivariate polynomial data. It handles \
sparse multivariate polynomials over different coefficient domains, \
such as Z, Q and GF(q), as well as algebraic extensions over Q and \
GF(q) in an efficient way. Factory includes algorithms for computing \
univariate and multivariate gcds, resultants, chinese remainders, and \
several algorithms to factorize univariate polynomials over the \
integers and over finite fields."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "libfactory-4_4_1-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "cb25d8607e2596a5c4a492a44e968baf7355db34fbb13f44e1446b9198708c57ea3dfcf7f9d41eef3dd3fb8a6e8a2002f714a5c1636478b7f5ad6be043b41166"

RPROVIDES:${PN} += "libfactory-4-4-1 \
libfactory-4.4.1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libflint.so.24 \
libgcc-s.so.1 \
libgmp.so.10 \
libm.so.6 \
libntl.so.45 \
libomalloc-4.4.1.so \
libsingular-resources-4.4.1.so \
libstdc++.so.6"

inherit rpm
