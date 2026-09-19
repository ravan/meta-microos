SUMMARY = "Planets as Background Pictures or Interactive Animations"
DESCRIPTION = "Xplanet can display the earth or other planets in the background of \
your display, similar to xearth or xglobe. Additionally, it can run in \
interactive mode allowing you to rotate or zoom the planet. Also, with \
an included script, it is very easy to combine map files with current \
satellite cloud images."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "xplanet-1.3.1-4.14.aarch64.rpm"
RPM_HASH = "d2f4bb20f1dbda9780280a21635f23051a1676c49d847ff228084b187a6a3acc9df55e8b8c32e395e61968fec0ef8f42a4618121560f64bfa0a2b05593dde15d"

RPROVIDES:${PN} += "xplanet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgif.so.7 \
libgobject-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnetpbm.so.11 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
