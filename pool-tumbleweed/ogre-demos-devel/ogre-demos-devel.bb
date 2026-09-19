SUMMARY = "Sources for the Ogre demo programs"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains the source of the demo applications."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-demos-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "1151928d3d77b5a4a97615e6ef6a54bae2dc80e21d6ce9205641674c80ef82fd46de6ebeb4860a3feef23e10049c1b8ab60add25868c7c0f1092d04919da473a"

RPROVIDES:${PN} += "ogre-demos-devel"

RDEPENDS:${PN} += "libOgreRTShaderSystem-devel \
libOgreTerrain-devel"

inherit rpm
