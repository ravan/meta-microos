SUMMARY = "Bullet Convex Decomposition Library"
DESCRIPTION = "Bullet is a Collision Detection and Rigid Body Dynamics Library."
LICENSE = "Zlib"

PV = "3.25"

RPM_NAME = "libConvexDecomposition3_25-3.25-2.1.aarch64.rpm"
RPM_HASH = "18c118f0e1593fa8fbbd90d42339a8bd0e2574f56da74be5acd27ec20643ae24c34d5da0e07996e5ae94a9b1d6121b1a9a830a3b474709ec95ba924a6e4d671a"

RPROVIDES:${PN} += "libConvexDecomposition.so.3.25 \
libConvexDecomposition3-25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLinearMath.so.3.25 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
