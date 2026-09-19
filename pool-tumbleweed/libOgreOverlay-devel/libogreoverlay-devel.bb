SUMMARY = "Development files for the Ogre Overlay component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the overlay component."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreOverlay-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "396201317a4cefee853077d8c2dc8e4324378011186d6b6f1ee9148eef99053af348d3ab853b71ecc04d9729ff182b4c58017999db1c721f2ca4c1ea6d34bc5e"

RPROVIDES:${PN} += "libOgreOverlay-devel \
pkgconfig-OGRE-Overlay"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreOverlay13-6 \
pkgconfig-OGRE"

inherit rpm
