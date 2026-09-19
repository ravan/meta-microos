SUMMARY = "Frequency tables and some Tools for motv and xawtv"
DESCRIPTION = "This package includes frequency tables for various countries and some utilities \
for xawtv and motv (xawtv-remote, for example)."
LICENSE = "GPL-2.0-or-later"

PV = "3.107"

RPM_NAME = "tv-common-3.107-3.9.aarch64.rpm"
RPM_HASH = "fbb2ca635b7173a230aa56cf83cd0d1c0717bd951c29a41f527cd9395dd1e5fe8b0e0fcda7fb0be181a701fc32cafb535e14deacb366133bdaaa116fdb7cae2f"

RPROVIDES:${PN} += "tv-common \
xawtv-/usr/X11R6/lib/X11/fonts/misc/led-iso8859-1.bdf"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXmu.so.6 \
libXt.so.6 \
libc.so.6 \
libdv.so.4 \
libjpeg.so.8 \
libm.so.6 \
libquicktime.so.0 \
libv4l2.so.0"

inherit rpm
