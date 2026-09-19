SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreBites13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "020da8288768e0d9e163af80a0809c1d6af8f35a64126e7d55aefb5c2b8bd8167e8fddfd530db0c07a0715c3df9b01e3176c4a692a21b20e36f2a8bdd271aab9"

RPROVIDES:${PN} += "libOgreBites.so.13.6 \
libOgreBites13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libOgreOverlay.so.13.6 \
libOgreRTShaderSystem.so.13.6 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
