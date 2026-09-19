SUMMARY = "USB redirection support for QEMU"
DESCRIPTION = "This package contains a module for USB redirection support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-usb-redirect-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "f4bd9ef380a7b526cde9914f392e61a293bc216d7ba8e4ae9fc034f9ba8468b5b40e803782d269f34f81b562ec0947685bff55ad134266d8818326959cd3b139"

RPROVIDES:${PN} += "qemu-hw-usb-redirect"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusbredirparser.so.1"

inherit rpm
