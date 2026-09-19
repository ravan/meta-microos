SUMMARY = "A clothoid to bezier spline converter"
DESCRIPTION = "libspiro contains routines which will convert an array of clothoid \
spline control points into an equivalent set of bezier control points."
LICENSE = "GPL-3.0-or-later"

PV = "20240903"

RPM_NAME = "libspiro1-20240903-1.5.aarch64.rpm"
RPM_HASH = "744948f5d4cb4d6db6326efbac6f8a75dc9c9b11a69b1481085e9e4c0b6d428d1a3d42a0002c5e45fd5bd3aa7f327ab42f397ad3220a82f2c12ba601f0405738"

RPROVIDES:${PN} += "libspiro.so.1 \
libspiro1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
