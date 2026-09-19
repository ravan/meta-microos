SUMMARY = "Development files for libevdi Library"
DESCRIPTION = "The Extensible Virtual Display Interface (EVDI) is a Linux kernel module \
that enables management of multiple screens, allowing user-space programs \
to take control over what happens with the image. It is essentially \
a virtual display you can add, remove and receive screen updates for, in \
an application that uses the libevdi library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "evdi-devel-1.15.0-1.2.aarch64.rpm"
RPM_HASH = "0552e84784a6ddd3f5d8005b04109207bff3c59cd6d858a73adfc02433b3d6dbad3c6a09dc2a626be1b41e8448b412425ad5048d877c5eedf0f3f4733bee81e7"

RPROVIDES:${PN} += "evdi-devel"

RDEPENDS:${PN} += "libevdi1"

inherit rpm
