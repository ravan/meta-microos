SUMMARY = "Qt 6 Quick3D Physics Extensions"
DESCRIPTION = "This module adds physical simulation capabilities on top of Qt Quick 3D. \
In particular, it enables rigid body simulation using simple primitives as well \
as convex- and triangle meshes and heightmaps. Physical properties such as mass, \
density, gravity and friction are customizable. This makes it possible to create \
physically correct behavior in 3D scenes without having to handcraft animations."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0fd7d67537e0db6be420a6c04b3c22ea99a162f077a1d5e0feeb1290b4b6d2ee63b85c4e2acbb48406b01da137c37a76349b2ec7e816aab4464752a41e7cad63"

RPROVIDES:${PN} += "qt6-quick3dphysics"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick3DUtils.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
