SUMMARY = "Python bindings for OGRE"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-python-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "d66acc9ea6e5c7d194e478ae2dcacd0ee91b2dea2459866f8b36c3d277f0fb4c25065f9bb27cebbffbda8fab5afcd263325ea58e0ffffd4c4e8a304beb514490"

RPROVIDES:${PN} += "ogre-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreBites.so.13.6 \
libOgreMain.so.13.6 \
libOgreOverlay.so.13.6 \
libOgreRTShaderSystem.so.13.6 \
libOgreTerrain.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
