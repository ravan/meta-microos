SUMMARY = "Spice vmc and port chardev support for QEMU"
DESCRIPTION = "This package contains a module for Spice chardev support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-chardev-spice-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "d54157bb53f4d550a94560f4ed88ed5db7cefcf2ba2825b75a792f9975b68963ff8eb94970376783222ad3b0beebdfb995b3a6e02937e34436eb9d1edc1969cb"

RPROVIDES:${PN} += "qemu-chardev-spice"

RDEPENDS:${PN} += "libc.so.6 \
libspice-server.so.1 \
qemu-ui-spice-core"

inherit rpm
