SUMMARY = "Boost.Random runtime library"
DESCRIPTION = "This package contains the Boost.Random runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_random1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "3654a1bacb4bf50d392b2403159d019929287c24bdbff579860421f41efd5d51288c8a8d74e89c99b77228eb1341bde12a5eb77cdc15cedf43a5cce91f8f6aaa"

RPROVIDES:${PN} += "libboost-random.so.1.91.0 \
libboost-random1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
