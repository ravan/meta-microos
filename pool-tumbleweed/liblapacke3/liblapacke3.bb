SUMMARY = "Native C Interface to LAPACK: shared library"
DESCRIPTION = "This library provides a native C interface to LAPACK routines available \
at www.netlib.org/lapack to facilitate usage of LAPACK functionality \
for C programmers."
LICENSE = "BSD-3-Clause"

PV = "3.12.1"

RPM_NAME = "liblapacke3-3.12.1-5.1.aarch64.rpm"
RPM_HASH = "457ee06b88ad50a2a7d25be65f3b7b8616877457cb9d091e5efefccf92b11d5a75efcc211d4e0916848832ff00744d52952bd48bdd5fbb5a5c2177cf6b43cadf"

RPROVIDES:${PN} += "liblapacke.so.3 \
liblapacke3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblapack.so.3 \
update-alternatives"

inherit rpm
