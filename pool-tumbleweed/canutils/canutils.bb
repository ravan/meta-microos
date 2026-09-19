SUMMARY = "Utilities for Controller Area Networks from the Linux-CAN project"
DESCRIPTION = "SocketCAN userspace utilities and tools. \
 \
CAN is a message-based network protocol designed for vehicles \
originally initially created by Robert Bosch GmbH. SocketCAN is a set \
of CAN drivers and a networking stack contributed by Volkswagen \
Research to the Linux kernel. \
 \
This package contains some userspace utilities for the Linux \
SocketCAN subsystem."
LICENSE = "BSD-3-Clause & GPL-2.0-only & LGPL-2.0-only"

PV = "2025.01"

RPM_NAME = "canutils-2025.01-1.7.aarch64.rpm"
RPM_HASH = "2faed8ec4ee26d2964ac7cf85e6a9b2a03542a72240df767cff5b39f8d633a198f0bf70277dd63793fc672a1d3bafd64ad4586f26e9ee0f341e8e5f74973e35f"

RPROVIDES:${PN} += "can-utils \
canutils \
canutils-linuxcan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libisobusfs.so.0"

inherit rpm
