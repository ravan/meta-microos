SUMMARY = "Additional utilities for working with the Ogre 3D engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains various tools that make working with ogre easier."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-tools-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "94a79337b809839ec810b5df59764bba467f4b1f03afa2b18963e1349f7b98df7750b0b8341ffd3b94522401db374b42a52f62dacde2d336241b3e6e263892e1"

RPROVIDES:${PN} += "ogre-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOgreMain.so.13.6 \
libOgreMeshLodGenerator.so.13.6 \
libOgreRTShaderSystem.so.13.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpugixml.so.1 \
libstdc++.so.6"

inherit rpm
