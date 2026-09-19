SUMMARY = "Boost.Filesystem Runtime Libraries"
DESCRIPTION = "This package contains the Boost.Filesystem library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_filesystem1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "ffba2d9a9ec6c72a1663dcf4c56af52f13ad8c3ce6535b378a8773e8fb8de3c700d2f97591e639d60717d26f84ed4713624d6df8d120e83b46996da990448c3d"

RPROVIDES:${PN} += "libboost-filesystem.so.1.91.0 \
libboost-filesystem1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
