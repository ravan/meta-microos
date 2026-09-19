SUMMARY = "Library for Number Theory"
DESCRIPTION = "NTL is a C++ library providing data structures and algorithms for \
manipulating signed, arbitrary length integers, and for vectors, \
matrices, and polynomials over the integers and over finite fields."
LICENSE = "LGPL-2.1-or-later"

PV = "11.6.0"

RPM_NAME = "libntl45-11.6.0-1.4.aarch64.rpm"
RPM_HASH = "00494183622f1b5a3f6abd7f4ab875269fc96c7df6a19c1b20932bd26b2a2dbf50d0af901218349cae4433f3fe74289ef7506ef5a5db68ee19b1eb2366bb0d9c"

RPROVIDES:${PN} += "libntl.so.45 \
libntl45"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgf2x.so.3 \
libgmp.so.10 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
