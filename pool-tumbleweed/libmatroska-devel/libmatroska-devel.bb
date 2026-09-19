SUMMARY = "Library to Deal with Matroska Files"
DESCRIPTION = "Libmatroska is a C++ library to parse Matroska files (.mkv and .mka). \
It depends on libebml to work. You only need this package to compile \
your own applications."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.2"

RPM_NAME = "libmatroska-devel-1.7.2-1.1.aarch64.rpm"
RPM_HASH = "3c097ea242f372d882673e6b22f8fe90da3e69dd45f81d0f7f1e2afaa8ae384a99243c5cf258067a350ad142b3eaca78dc7c1bf85344ed0639946df42c89e594"

RPROVIDES:${PN} += "cmake-Matroska \
libmatroska-devel \
pkgconfig-libmatroska"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmatroska7 \
pkgconfig-libebml"

inherit rpm
