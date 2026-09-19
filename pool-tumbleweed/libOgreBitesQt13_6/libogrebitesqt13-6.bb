SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreBitesQt13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "ccce5287ab0704d2a4f7a03825adadc2b874d666791209af4e286c9fad144dd7eb71d854609409e80c4af22a5a4fb8ceb4a731c61fec6db13124a50fb8254e84"

RPROVIDES:${PN} += "libOgreBitesQt.so.13.6 \
libOgreBitesQt13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreBites.so.13.6 \
libOgreMain.so.13.6 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
