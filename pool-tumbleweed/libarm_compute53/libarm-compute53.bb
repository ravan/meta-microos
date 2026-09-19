SUMMARY = "ARM Compute Library"
DESCRIPTION = "A software library for computer vision and machine learning. \
The Compute Library is a collection of low-level functions optimized for Arm CPU and GPU architectures targeted at image processing, computer vision, and machine learning. \
Library part."
LICENSE = "MIT"

PV = "53.2.0"

RPM_NAME = "libarm_compute53-53.2.0-1.1.aarch64.rpm"
RPM_HASH = "7e2677c5425418d04e1d964544b0d0c376615c060259234813d631c3fb6ccc9a665065ac805119ce8dd22fcea8622889645f8dfd6d6192d958403273740428bd"

RPROVIDES:${PN} += "libarm-compute.so.53 \
libarm-compute53"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
