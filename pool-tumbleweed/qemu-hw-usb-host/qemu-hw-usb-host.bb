SUMMARY = "USB passthrough driver support for QEMU"
DESCRIPTION = "This package contains a modules for USB passthrough driver for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-usb-host-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "0683658e4eaf0369e4f0729c9237de7a054e88d533638f20502392f6dddb795bc912e387cdf28429831405ca63feef8e2ad88e049367049893278992b2fe415b"

RPROVIDES:${PN} += "qemu-hw-usb-host"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
