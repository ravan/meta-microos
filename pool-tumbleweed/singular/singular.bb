SUMMARY = "Computer algebra system for polynomials"
DESCRIPTION = "Singular is a computer algebra system for polynomial computations, \
with special emphasis on commutative and non-commutative algebra, \
algebraic geometry, and singularity theory. \
 \
Its main computational objects are ideals, modules and matrices over \
a large number of baserings. These include \
 \
* polynomial rings over various ground fields and some rings \
  (including the integers), \
* localizations of the above, \
* a general class of non-commutative algebras (including the exterior \
  algebra and the Weyl algebra), \
* quotient rings of the above, \
* tensor products of the above. \
 \
Singular's core algorithms handle \
 \
* Gröbner and standard bases and free resolutions, \
* polynomial factorization, \
* resultants, characteristic sets, and numerical root finding."
LICENSE = "BSD-3-Clause & GPL-2.0-only & GPL-3.0-only & LGPL-2.1-only"

PV = "4.4.1"

RPM_NAME = "singular-4.4.1-2.9.aarch64.rpm"
RPM_HASH = "03b446df88222b674e8b2910d73fd645088cdb4a683ebc6c4ace0599df34940dc40d77b16feb4a85519ded0139a192b940a59032d95cf0411d0050c2ce654233"

RPROVIDES:${PN} += "singular"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSingular-4.4.1.so \
libc.so.6 \
libfactory-4.4.1.so \
libgcc-s.so.1 \
libgmp.so.10 \
libomalloc-4.4.1.so \
libpolys-4.4.1.so \
libsingular-resources-4.4.1.so \
libstdc++.so.6"

inherit rpm
