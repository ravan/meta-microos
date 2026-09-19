SUMMARY = "Development files for the Ogre Main library"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreMain-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "f12a3770acd1a6c55ee74e80d5020f17c17f141aca9c75dae15d2542d6a604d3e33cd35d82511b1232bad09ac2e68685a8c795405e1638a0f9249c333c5429e2"

RPROVIDES:${PN} += "libOgreMain-devel \
pkgconfig-OGRE \
pkgconfig-OGRE-PCZ"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreMain13-6 \
libOgreMain13-6-codecs \
libOgreMain13-6-plugins \
ogre-media \
pkgconfig-freetype2 \
pkgconfig-x11 \
pkgconfig-xaw7 \
pkgconfig-xrandr \
pkgconfig-zziplib"

inherit rpm
