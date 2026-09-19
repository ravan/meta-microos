SUMMARY = "Extensible Virtual Display Interface (EVDI) is a Linux Kernel Module"
DESCRIPTION = "The Extensible Virtual Display Interface (EVDI) is a Linux kernel module \
that enables management of multiple screens, allowing user-space programs \
to take control over what happens with the image. It is essentially \
a virtual display you can add, remove and receive screen updates for, in \
an application that uses the libevdi library."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "evdi-1.15.0-1.2.aarch64.rpm"
RPM_HASH = "272414a11a742422be83a967895f2514a5d36257355ddfe714704377a63524478b88aa110a624470c33989a2450fee76f2f9d0ab8c9b8d5ab9873635fd0a1bca"

RPROVIDES:${PN} += "evdi"

RDEPENDS:${PN} += ""

inherit rpm
