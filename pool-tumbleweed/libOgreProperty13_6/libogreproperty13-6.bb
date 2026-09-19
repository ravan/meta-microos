SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
OGRE's property system allows you to associate values of arbitrary type with \
names, and have those values exposed via a self-describing interface."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreProperty13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "8f43756dd1249a91c62c9e00569a94964f0fe8cb0cfe32bc83f74f4c97ed485f705dcc56663956e0ca5eea851f84852a773371d96b773f0126b6ce64d07858de"

RPROVIDES:${PN} += "libOgreProperty.so.13.6 \
libOgreProperty13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
