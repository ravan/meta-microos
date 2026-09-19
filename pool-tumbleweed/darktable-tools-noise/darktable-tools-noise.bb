SUMMARY = "Noise profiling tools to support new cameras"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the noise profiling tools to add support for new cameras."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "darktable-tools-noise-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "16e232be63e46cea105e3c8c2def2818865d68fe02934df45bdeb2d24af845b4e2e0a12145fdf54b31fde77a568de7a564832051f7c77e2a1f2291524ffe370a"

RPROVIDES:${PN} += "darktable-tools-noise"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/convert \
ghostscript \
gnuplot \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
