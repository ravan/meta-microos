SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreMain13_6-codecs-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "1a6510167248efbad7a5a591976ceb5b6c886a1a91e82f78297444b9d17070b438d48037a30013fdd5bcf17931ef53ddd9994359d13c6a8265114490348d8d6e"

RPROVIDES:${PN} += "libOgreMain-codecs \
libOgreMain13-6-codecs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libOgreRTShaderSystem.so.13.6 \
libassimp.so.6 \
libc.so.6 \
libfreeimage.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
