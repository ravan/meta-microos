SUMMARY = "Development files for the Ogre Volume component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the volume component."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreVolume-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "a8afce9b090feabcd121db84e3eab56d07db77556a07f1f4791b0fdf3685b3dc076fad00dc9b16f3f327ab59c5325bcc4d802e078bde42e635850f8c9a9b8eb6"

RPROVIDES:${PN} += "libOgreVolume-devel \
pkgconfig-OGRE-Volume"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreVolume13-6 \
pkgconfig-OGRE"

inherit rpm
