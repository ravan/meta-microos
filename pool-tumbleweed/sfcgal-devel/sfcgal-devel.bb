SUMMARY = "Development files and tools for SFCGAL applications"
DESCRIPTION = "Content headers & files to envelopment files for libSFCGAL2"
LICENSE = "LGPL-2.0-or-later"

PV = "2.3.0"

RPM_NAME = "sfcgal-devel-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "eb69afdc49650bc4812f9fa9342608058517ce0771b758e641bf30d698dadc418422537375c04595f68fba6b343c6eb769d6fbb0da4edf21c1da81a8bcd3774a"

RPROVIDES:${PN} += "cmake-SFCGAL \
pkgconfig-sfcgal \
sfcgal-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libSFCGAL2 \
pkgconfig-nlohmann-json"

inherit rpm
