SUMMARY = "Development environment for the freetype2 TrueType font library"
DESCRIPTION = "This package contains all necessary include files, libraries and \
documentation needed to develop applications that require the freetype2 \
TrueType font library. \
 \
It also contains a small tutorial for using that library."
LICENSE = "FTL & GPL-2.0-only"

PV = "2.14.3"

RPM_NAME = "freetype2-devel-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "09e605eebeb6001e202fbce5ff7ecad66c8ace2f62cd400e75dad5e7ea2740f1d1fc2d9a2bdcba302497dfa9fb7d56baaeb1a858bf4ce9303420eb45844027e8"

RPROVIDES:${PN} += "freetype-devel \
freetype2-devel \
libfreetype6-devel-static \
pkgconfig-freetype2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libfreetype6 \
pkgconfig-bzip2 \
pkgconfig-libbrotlidec \
pkgconfig-zlib"

inherit rpm
