SUMMARY = "The basecurve tool from tools/basecurve/"
DESCRIPTION = "darktable is a virtual lighttable and darkroom for photographers: it manages \
digital negatives in a database and can show them through a zoomable \
lighttable. It also enables developing raw images and enhance them. \
 \
This package provides the basecurve tool from tools/basecurve/. \
Another option to solve the same problem might be the darktable-chart module \
from the darktable package."
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "darktable-tools-basecurve-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "4b0d08e2371fb01559f2592d79547d68656dedb5747a722f807e9fd4b9d0da6f726ca994aba1230bab7795f474df159be6c59fc48836fcaa7daa7e8e2fab6f33"

RPROVIDES:${PN} += "darktable-tools-basecurve"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/convert \
dcraw \
exiftool \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexiv2.so.28 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
