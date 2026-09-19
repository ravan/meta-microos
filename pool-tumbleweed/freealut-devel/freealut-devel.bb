SUMMARY = "Static libraries, header files and tests for openal library"
DESCRIPTION = "OpenAL is an audio library designed in the spirit of OpenGL - machine \
independent, cross platform, and data format neutral, with a clean, \
simple C-based API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "freealut-devel-1.1.0-237.29.aarch64.rpm"
RPM_HASH = "d301b1361988f7833cee731d155625a36a405857160b4b5493f653b350281227cef163179d75262c94899a023da431a4d04e051c8336272bec6816d2f2ea5085"

RPROVIDES:${PN} += "freealut-devel \
pkgconfig-freealut"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
glibc-devel \
libalut0 \
pkgconfig-openal"

inherit rpm
