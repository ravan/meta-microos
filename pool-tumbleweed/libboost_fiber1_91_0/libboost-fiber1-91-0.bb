SUMMARY = "Boost.Fiber runtime library"
DESCRIPTION = "This package contains Boost.Fiber runtime library."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_fiber1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "b262cd6d064cbb60a62bc1cfa5f3baf332b1af80c9784589d84449b7066c1ac0ae2406ae4b1732e47fb6f3e2622f7568f3dd67a3d6be15baeb494113e7818015"

RPROVIDES:${PN} += "libboost-fiber.so.1.91.0 \
libboost-fiber1-91-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
ld-linux-aarch64.so.1 \
libboost-context.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
