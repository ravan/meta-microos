SUMMARY = "D-Bus based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing D-Bus based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-dbus-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "9a615e5cfdf1d06e1b10316c383c32a9a9f61da824adc8e667fc682a4a4cc20581d660a40e976cb7d69426c0bf8ed2959515ef081db14ef958370404d56ee38b"

RPROVIDES:${PN} += "qemu-ui-dbus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libepoxy.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpixman-1.so.0"

inherit rpm
