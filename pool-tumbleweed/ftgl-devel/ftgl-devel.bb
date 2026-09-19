SUMMARY = "Development files for the FTGL OpenGL font managing library"
DESCRIPTION = "FTGL is a C++ library using Freetype2 to render fonts in OpenGL \
applications. FTGL supports bitmaps, pixmaps, texture maps, outlines, \
polygon mesh, and extruded polygon rendering modes. \
 \
This package provides development files."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "ftgl-devel-2.4.0-3.5.aarch64.rpm"
RPM_HASH = "6508afee2622a6137053596f51acbc6af495b30c0d6d56328411933694a9c3e1e8306251267b625d7b0939c2b1f36c7a5cb4cdd6cbfe69b1b5685b938146028b"

RPROVIDES:${PN} += "ftgl-devel \
pkgconfig-ftgl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libftgl2 \
pkgconfig-freetype2"

inherit rpm
