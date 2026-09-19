SUMMARY = "C/C++ library for generating prime numbers"
DESCRIPTION = "This package contains the shared runtime library for primesieve."
LICENSE = "BSD-2-Clause"

PV = "12.15"

RPM_NAME = "libprimesieve12-12.15-1.2.aarch64.rpm"
RPM_HASH = "5aa5f77362398a77330790702675ae0c58b6932a73b10453be73c073862ca7be6b3de658f94c851c01b143611a50dadbc9fac22863bb41e3e9692d3dd1e0c166"

RPROVIDES:${PN} += "libprimesieve.so.12 \
libprimesieve12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
