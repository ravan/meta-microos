SUMMARY = "Sprite position adjuster for PNG files"
DESCRIPTION = "grabpng allows to change the PNG 'GRAB' and 'ALPH' chunks used by \
ZDoom."
LICENSE = "GPL-3.0 & BSD-3-Clause"

PV = "20160630"

RPM_NAME = "grabpng-20160630-1.37.aarch64.rpm"
RPM_HASH = "8cb4db369950730c3d3dea89f5ec72377192cc2bb86c5f1f926201333521c4fbf4ef87f0ee9d1100c843e3d939b83b65222c5b5f70e8a840394f820a4f883d4d"

RPROVIDES:${PN} += "grabpng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
