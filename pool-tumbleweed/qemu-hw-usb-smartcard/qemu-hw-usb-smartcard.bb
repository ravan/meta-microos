SUMMARY = "USB smartcard support for QEMU"
DESCRIPTION = "This package contains a modules for USB smartcard support for QEMU."
LICENSE = "BSD-2-Clause & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "11.1.1"

RPM_NAME = "qemu-hw-usb-smartcard-11.1.1-1.1.aarch64.rpm"
RPM_HASH = "03aba51aa190cb191fa544e61825bded2d77f982c138ddc8534019dc2c1a64fa9f52c057d75c0c131f05875f2e5da37a1d83f7b29146aabcf4c7eb604bbf206a"

RPROVIDES:${PN} += "qemu-hw-usb-smartcard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcacard.so.0"

inherit rpm
