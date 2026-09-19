SUMMARY = "Development headers for rapid prototyping"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
Reusable utilities for rapid prototyping with Ogre."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreBites-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "12791988e22638f791b112d7240c3ad434de39891d8dec8f02fda9ee4d36137b099dbf6ab464e8aa4d112331f2e111caf8a290c2986ea6353927200cdf59279d"

RPROVIDES:${PN} += "libOgreBites-devel \
pkgconfig-OGRE-Bites"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreBites13-6 \
libOgreBitesQt13-6 \
pkgconfig-OGRE \
pkgconfig-sdl2"

inherit rpm
