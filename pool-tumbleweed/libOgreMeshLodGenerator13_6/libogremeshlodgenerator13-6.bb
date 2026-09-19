SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Mesh LOD allows to swap the models to Low-poly models in far distance, which makes your game faster."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreMeshLodGenerator13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "1706b70c86b759c99c7feb243c2f7e412658d777d2f2163fba2552c8f73904d391c5f5f8547e85c04c23ac97fd0dfba5bf91e5a04a18296e9a744c0fd5a2aa1f"

RPROVIDES:${PN} += "libOgreMeshLodGenerator.so.13.6 \
libOgreMeshLodGenerator13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
