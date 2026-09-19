SUMMARY = "Bullet HACD Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libHACD3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "e0e83f06e5bd968fa93e79969f4a03e78cb0738caba71799ccf684baea71b35397158795a6ee4d7a394e32b7522ff997f3c1ac7df08415bdb1dea16d441a3daa"

RPROVIDES:${PN} += "libHACD.so.3.25 \
libHACD3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
