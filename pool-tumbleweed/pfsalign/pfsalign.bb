SUMMARY = "Align image stack"
DESCRIPTION = "Align multiple exposures using homographic transformation. The command \
uses a similar feature-point based method as most panorama stitching software."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "pfsalign-2.2.0-5.10.aarch64.rpm"
RPM_HASH = "a6d1923a8585e88ca757bc17a252a37323c97e8258f162b40ccfdd7596625bd00c6e9d4133cfaafefe0e3eacc7abca86cd1271c14b4eac1e7ca9c9a28737ef13"

RPROVIDES:${PN} += "pfsalign"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libopencv-calib3d.so.413 \
libopencv-core.so.413 \
libopencv-features2d.so.413 \
libopencv-highgui.so.413 \
libopencv-imgproc.so.413 \
libpfs.so.2 \
libstdc++.so.6"

inherit rpm
