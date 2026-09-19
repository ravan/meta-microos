SUMMARY = "Development files for Coin, a 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Coin."
LICENSE = "BSD-3-Clause"

PV = "4.0.3"

RPM_NAME = "Coin4-devel-4.0.3-2.4.aarch64.rpm"
RPM_HASH = "b3ae1852cbb65db51ad81b844845357f09299dda1edfa23dee0adc7f171b3ad374a56b111c1b45f17d7589c369cf0bc40575195628d8cfbb7b2fddd9e3c35023"

RPROVIDES:${PN} += "Coin4-devel \
cmake-coin \
pkgconfig-Coin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
fontconfig-devel \
freetype2-devel \
libCoin80 \
openal-soft-devel \
pkgconfig-bzip2 \
pkgconfig-dri \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-x11 \
zlib-devel"

inherit rpm
