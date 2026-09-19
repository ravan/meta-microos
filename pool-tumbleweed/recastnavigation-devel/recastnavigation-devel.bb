SUMMARY = "Include Files for Recastnavigation Libraries"
DESCRIPTION = "This package contains files and libraries needed for develeopment with \
recastnavigation libraries."
LICENSE = "Zlib"

PV = "1.6.0"

RPM_NAME = "recastnavigation-devel-1.6.0-1.9.aarch64.rpm"
RPM_HASH = "c1cbd1965060fadfc71d3d989cceb92e3a37eb9adeacbd3b4745c404df10e1cf0e142b1d52d25d559f01332b2f0cd9dad97d816a1a7c6be13761351407415f76"

RPROVIDES:${PN} += "cmake-recastnavigation \
pkgconfig-recastnavigation \
recastnavigation-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libDebugUtils1 \
libDetour1 \
libDetourCrowd1 \
libDetourTileCache1 \
libRecast1"

inherit rpm
