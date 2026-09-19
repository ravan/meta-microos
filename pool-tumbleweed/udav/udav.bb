SUMMARY = "Data handling and plotting tool"
DESCRIPTION = "UDAV is a program for data array visualization using the MathGL \
library. It support a wide spectrum of graphics, a simple script \
language and visual data handling and editing. It has a window \
interface for data viewing, changing and plotting. It can also \
execute MGL scripts, set up, rotate graphics, and so on."
LICENSE = "GPL-3.0-only"

PV = "8.0.3"

RPM_NAME = "udav-8.0.3-2.6.aarch64.rpm"
RPM_HASH = "d60bcb5988c686496c2356bab0b27800893edea86f2df0ed232c926e7571f0810f825ad68008e1ddfb2ec9bfc840bca6bd662ec0bc1f075a48647df12ac0a264"

RPROVIDES:${PN} += "udav"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libfltk.so.1.3 \
libgcc-s.so.1 \
libgomp.so.1 \
libhdf5.so.310 \
libm.so.6 \
libmgl-fltk.so.8 \
libmgl-qt.so.8 \
libmgl.so.8 \
libstdc++.so.6"

inherit rpm
