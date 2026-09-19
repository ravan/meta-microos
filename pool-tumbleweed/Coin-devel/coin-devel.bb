SUMMARY = "Development files for Coin, a 3D graphics library"
DESCRIPTION = "Coin is a scene-graph based, retain-mode, rendering and model \
manipulation C++ class library that uses OpenGL for its 3D graphics. \
Coin is compatible to Open Inventor 2.1 and also has support for 3D \
sound, GLSL shaders, and additional file formats like VRML97. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of Coin."
LICENSE = "GPL-2.0-only"

PV = "3.1.3"

RPM_NAME = "Coin-devel-3.1.3-7.11.aarch64.rpm"
RPM_HASH = "faab9de9179d7c587b101ec79cca7fb36a66382899d81d3b08850215c92bf627a0979bcddd96a414f040a8c0344bffb192db7323130f1aee07ebe8a8398f2ec9"

RPROVIDES:${PN} += "Coin-devel \
pkgconfig-Coin"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
fontconfig-devel \
freetype2-devel \
libCoin60 \
openal-soft-devel \
pkgconfig-bzip2 \
pkgconfig-dri \
pkgconfig-gl \
pkgconfig-glu \
pkgconfig-ice \
pkgconfig-x11 \
pkgconfig-xt \
zlib-devel"

inherit rpm
