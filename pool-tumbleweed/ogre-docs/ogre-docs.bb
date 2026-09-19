SUMMARY = "Documentation for the Ogre 3D engine"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented, flexible \
3D engine written in C++ designed to make it easier and more intuitive for \
developers to produce applications utilising hardware-accelerated 3D graphics. \
The class library abstracts all the details of using the underlying system \
libraries like Direct3D and OpenGL and provides an interface based on world \
objects and other intuitive classes. \
 \
This package contains the documentation for OGRE."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "ogre-docs-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "ef53d4e4f57063df9d7540c53f16257f627306c006be24c72101df63b79c044a1ee4b58fcccf7ba24dff894589d7198eb28c59ad46dff0e6ee576698c2905f60"

RPROVIDES:${PN} += "ogre-docs"

RDEPENDS:${PN} += ""

inherit rpm
