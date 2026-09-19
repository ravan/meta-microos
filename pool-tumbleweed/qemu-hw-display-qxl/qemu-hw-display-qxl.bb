SUMMARY = "QXL display support for QEMU"
DESCRIPTION = "This package contains a module for QXL display support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-display-qxl-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "a5bf276b94a150db05aa734ee8a9ef54cee3b372f29bdc4b86e2bc9d1dbf9b1b3ad556817c840e3e9fe7966b123988c3e3dbc1e4985fb47c6aaa2a0ff81a1930"

RPROVIDES:${PN} += "qemu-hw-display-qxl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpixman-1.so.0 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
