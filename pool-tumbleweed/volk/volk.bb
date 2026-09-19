SUMMARY = "Vector-Optimized Library of Kernels"
DESCRIPTION = "VOLK is a library of vector-optimized kernels. It is a subproject \
of GNU Radio, but can also be used standalone."
LICENSE = "LGPL-3.0-or-later"

PV = "3.3.0"

RPM_NAME = "volk-3.3.0-1.5.aarch64.rpm"
RPM_HASH = "73c50de873c8adb189370f1f3ee9dbdc40510bfa117d15b0f7ecbdc00267c5ea4224dcbd9b636e9a7d998ae8d0705e9b0e07696ffc0241b63d06767e448696f4"

RPROVIDES:${PN} += "bundled-cpu-features \
volk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvolk.so.3.3"

inherit rpm
