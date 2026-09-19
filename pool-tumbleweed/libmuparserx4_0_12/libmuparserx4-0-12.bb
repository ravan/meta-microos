SUMMARY = "A C++ Library for Parsing Expressions"
DESCRIPTION = "The muparserx shared library. A C++ Library for Parsing Expressions with \
Strings, Complex Numbers, Vectors, Matrices and more."
LICENSE = "BSD-2-Clause"

PV = "4.0.12"

RPM_NAME = "libmuparserx4_0_12-4.0.12-2.6.aarch64.rpm"
RPM_HASH = "f83fe51dea819e475c7d8fc7c48e076d4012d030106d22332754c1ad9fa8db0153f3b9987d5aaaecbda7dfbd709e1412ae3bfeafc20c319c3445a950a9a91bf9"

RPROVIDES:${PN} += "libmuparserx.so.4.0.12 \
libmuparserx4-0-12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
