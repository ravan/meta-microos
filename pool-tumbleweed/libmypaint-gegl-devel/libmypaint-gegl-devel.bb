SUMMARY = "Header files for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which \
is used by MyPaint and other projects. This package provides the header \
files needed for developing applications using the gegl bindings for libmypaint."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl-devel-1.6.1-2.14.aarch64.rpm"
RPM_HASH = "676f9ed2f70250f856a11e33e37b5af950c000508f4f0be98bb6d0b47250d2381877a33bbdd6ce5636baeaabaa0558ebe0eff05f0889bd8f06dbf5b3c74478ef"

RPROVIDES:${PN} += "libmypaint-gegl-devel \
pkgconfig-libmypaint-gegl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmypaint-gegl0 \
libmypaint0 \
pkgconfig-gegl-0.4 \
pkgconfig-libmypaint"

inherit rpm
