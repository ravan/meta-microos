SUMMARY = "Run-time library for projectM"
DESCRIPTION = "projectM is a music visualizer. \
This package contains its runtime library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.1.12"

RPM_NAME = "libprojectM3-3.1.12-4.7.aarch64.rpm"
RPM_HASH = "9d40cdcd9544b84898bb67770710be1ac640a285b294fd3969d79bda786badfc3500afae249b7814609ffaceb4492a68cded30362d4f285268acc7ec1f3d97ac"

RPROVIDES:${PN} += "libprojectM-qt5-3 \
libprojectM.so.3 \
libprojectM3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
