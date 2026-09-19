SUMMARY = "Rados Block Device (Ceph) support for QEMU"
DESCRIPTION = "This package contains a module for accessing ceph (rbd,rados) image files \
for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-block-rbd-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "ac035808f41aeaa5eda67044c6fef0df0022633203872c34082e9e6869bf74ea79d51bdb007768053247e9d0ccd18e338f38ab0c00a6e7cec68e9bf93e8c882c"

RPROVIDES:${PN} += "qemu-block-rbd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librados.so.2 \
librbd.so.1"

inherit rpm
