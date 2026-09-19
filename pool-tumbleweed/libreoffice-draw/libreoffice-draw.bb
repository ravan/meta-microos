SUMMARY = "LibreOffice Draw"
DESCRIPTION = "This module allows you to create and edit drawings, flow charts, and \
logos by using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-draw-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "1abf30dde0b434b65f5e22bf1068eed5247d44caeae789118a5e9e526b463437457d53b748f5f41d8491929cf6df8e8c0b162ad7cf8664795c08fde75a9777a8"

RPROVIDES:${PN} += "libpdfimportlo.so \
libreoffice-draw"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmergedlo.so \
libpoppler.so.162 \
libreoffice \
libreoffice-impress \
libstdc++.so.6 \
libuno-cppu.so.3 \
libuno-cppuhelpergcc3.so.3 \
libuno-sal.so.3 \
libuno-salhelpergcc3.so.3 \
libz.so.1 \
rtld-GNU-HASH"

inherit rpm
