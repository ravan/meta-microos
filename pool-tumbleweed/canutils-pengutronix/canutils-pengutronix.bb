SUMMARY = "Utilities for Controller Area Networks from the Pengutronix project"
DESCRIPTION = "SocketCAN userspace utilities and tools from Pengutronix. \
 \
CAN is a message-based network protocol designed for vehicles \
originally initially created by Robert Bosch GmbH. SocketCAN is a set \
of CAN drivers and a networking stack contributed by Volkswagen \
Research to the Linux kernel. \
 \
This package contains some userspace utilities for the Linux \
SocketCAN subsystem: canconfig candump canecho cansend cansequence."
LICENSE = "GPL-2.0-only"

PV = "4.0.6.g26"

RPM_NAME = "canutils-pengutronix-4.0.6.g26-1.21.aarch64.rpm"
RPM_HASH = "9f25a4578af1244a6cba2f3a8a3c3e296276c20247e9e60c6517e02dafe0838e7a7a61cfb26d104506553dbeb58192d83237556f254af09aadfebd5c01bd5b36"

RPROVIDES:${PN} += "canutils-pengutronix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsocketcan.so.2"

inherit rpm
