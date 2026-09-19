SUMMARY = "Automatic de-skew and bounding box determination for scanned page images"
DESCRIPTION = "This program determines the skew angle for text, and works with black/white \
images in TIFF or PBM format. To achieve this, it uses an original \
algorithm based on a fast implementation of the Radon transform. This \
program is part of the Page Layout Detection Tools project, which aims to \
automate the layout detection in scanned page images."
LICENSE = "GPL-2.0-or-later"

PV = "0.1"

RPM_NAME = "pagetools-0.1-2.25.aarch64.rpm"
RPM_HASH = "28f7ccf1064eef61271b8344c4e71826ac8ec51cfafad7290ff0c033b00e62b3e2d7e83355708dbc7bf1dbfddef356b0b7a07d1137fc1eb3db4065f0b39d2fef"

RPROVIDES:${PN} += "pagetools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnetpbm.so.11 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
