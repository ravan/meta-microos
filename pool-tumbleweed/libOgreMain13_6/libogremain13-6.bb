SUMMARY = "Ogre 3D: an open source graphics engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreMain13_6-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "224c97b9c8ed9498f8e4e730bba4d77c4c7c91d24586da180cdd8ad0ceb57455bdf82b87d2d0f258cb356b8d367b11d8738ce640e36fabadcfc6c62293c8da1b"

RPROVIDES:${PN} += "libOgreMain.so.13.6 \
libOgreMain13-6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
