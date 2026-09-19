SUMMARY = "Boost.Nowide runtime libraries"
DESCRIPTION = "This package contains the Boost.Math Runtime libraries."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_nowide1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f4ba5e5dcd79b8294450ffdaa9bcb3c3c2332d9dedb8e446e68888fd79c26e22df3e9ec9127d94eb78ac6eb9ae710fbb0b2c47a7abfe3fed3e7bf6a87d0fcfac"

RPROVIDES:${PN} += "libboost-nowide.so.1.91.0 \
libboost-nowide1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
