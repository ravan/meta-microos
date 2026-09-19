SUMMARY = "A C++ library for relativistic kinematics"
DESCRIPTION = "rk provides a C++ double precision implementation of several \
basic geometric entities and transformations: points in 3d, \
directions in 3d (unit vectors), 3-vectors, points in 4d, \
4-vectors, rotations, linear transformations, and boosts. The main \
purpose of the package is representing 4-momenta of relativistic \
particles and related formulae. \
 \
This package provides the shared libraries required for rk."
LICENSE = "X11"

PV = "1.8"

RPM_NAME = "librk0-1.8-1.11.aarch64.rpm"
RPM_HASH = "7cf13170eb42bf6361ed1a540b493defa31760342b911bf376467ba37305adc68846b11ffd11de3c958500b64bb9b69dead9617c4680313b13c55b54475cf962"

RPROVIDES:${PN} += "librk.so.0 \
librk0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
