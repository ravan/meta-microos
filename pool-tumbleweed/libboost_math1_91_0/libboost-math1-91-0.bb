SUMMARY = "Boost.Math runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_math1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "5dade2091546b65b1c4bf2d5729ef4744e2346adbb9b8f535a0f2aaca25d6b88a1fa019383a9ef1a70585c034b5e06d0a11234a5721fd805a73605923a70074e"

RPROVIDES:${PN} += "libboost-math-c99.so.1.91.0 \
libboost-math-c99f.so.1.91.0 \
libboost-math-c99l.so.1.91.0 \
libboost-math-tr1.so.1.91.0 \
libboost-math-tr1f.so.1.91.0 \
libboost-math-tr1l.so.1.91.0 \
libboost-math1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
