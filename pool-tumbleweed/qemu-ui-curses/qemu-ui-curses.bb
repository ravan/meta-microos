SUMMARY = "Curses based UI support for QEMU"
DESCRIPTION = "This package contains a module for doing curses based UI for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-ui-curses-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "02a853b13eb0aebed9ec357472724257abfc6b8def7ceaf88fccb0d8cc3dfb9b5be1d963686413df93061c4e6101783e978f21f4de4a7b675f7bf860988a4222"

RPROVIDES:${PN} += "qemu-ui-curses"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
