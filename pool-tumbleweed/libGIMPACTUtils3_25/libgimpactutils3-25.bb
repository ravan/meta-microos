SUMMARY = "Bullet GIMPACT Utils Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libGIMPACTUtils3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "874fdb139b314f250a33f5fc834585239421dbd62d270b755fba4e25c9208b1b1b46bf87b47581ceedb75d4460d881fa62a1cd8a21021444cb91e177814d58d4"

RPROVIDES:${PN} += "libGIMPACTUtils.so.3.25 \
libGIMPACTUtils3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libBulletCollision.so.3.25 \
libConvexDecomposition.so.3.25 \
libLinearMath.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
