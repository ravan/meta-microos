SUMMARY = "Spice UI support for QEMU"
DESCRIPTION = "This package contains a module for doing Spice based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-spice-app-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "db622db074022d5df609f1a09392f37f73a6a37a53300bb209bdf85adca38d9134b6addc048d7a43881c7f8a24b9e33686603208fb133a8db4a9126bb4672265"

RPROVIDES:${PN} += "qemu-ui-spice-app"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
qemu-chardev-spice \
qemu-ui-spice-core"

inherit rpm
