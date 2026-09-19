SUMMARY = "Tinkerforce Brick Daemon"
DESCRIPTION = "Brick Daemon is a small bridge between the USB port of Bricks and \
the TCP/IP socket connection to the language binding APIs."
LICENSE = "GPL-2.0-only"

PV = "2.4.9"

RPM_NAME = "brickd-2.4.9-1.3.aarch64.rpm"
RPM_HASH = "3a449f304ecd548729f5038bbc2cbf93b2981c2cdc1bf1f059d68f242ad7dd21368550851ca629ecae0cef62ffa018e0c337f6eb6492eaaca3d44f2161c25691"

RPROVIDES:${PN} += "brickd \
config-brickd"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
