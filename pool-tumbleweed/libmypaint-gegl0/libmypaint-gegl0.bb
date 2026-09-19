SUMMARY = "GEGL bindings for libmypaint, a brushstroke creation library"
DESCRIPTION = "libmypaint, a.k.a. 'brushlib', is a library for making brushstrokes which is \
used by MyPaint and other projects. This package provides the shared libraries \
for libmypaint's GEGL bindings."
LICENSE = "ISC"

PV = "1.6.1"

RPM_NAME = "libmypaint-gegl0-1.6.1-2.14.aarch64.rpm"
RPM_HASH = "833b68565d094a1849801e1eb07c5dc5dfc2cc3281283d1ae83ffd96fbaec7c4239e0877ba12ab3574b0f5de4370913735dcb5fd84e63ead89e330d4d9339d00"

RPROVIDES:${PN} += "libmypaint-gegl.so.0 \
libmypaint-gegl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbabl-0.1.so.0 \
libc.so.6 \
libgegl-0.4.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmypaint.so.0"

inherit rpm
