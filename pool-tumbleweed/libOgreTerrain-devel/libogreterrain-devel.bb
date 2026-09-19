SUMMARY = "Development files for the Ogre Terrain System component"
DESCRIPTION = "OGRE (Object-Oriented Graphics Rendering Engine) is a scene-oriented 3D engine. \
 \
This package contains the development headers for the Ogre Terrain System."
LICENSE = "LGPL-2.1-only"

PV = "13.6.5"

RPM_NAME = "libOgreTerrain-devel-13.6.5-5.1.aarch64.rpm"
RPM_HASH = "db5868d0443b08e43df9cfdacf85227668cf2d318def62cb4d1696e233d0befd242fc2753cabeaf413c52f383fdf75b49c0208f3a84373639ec7d599ce1861e7"

RPROVIDES:${PN} += "libOgreTerrain-devel \
pkgconfig-OGRE-Terrain"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libOgreTerrain13-6 \
pkgconfig-OGRE \
pkgconfig-OGRE-Paging"

inherit rpm
