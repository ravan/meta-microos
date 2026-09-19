SUMMARY = "Utility for Rockchip SoCs"
DESCRIPTION = "rkdeveloptool provides ways to read/write rockusb devices."
LICENSE = "GPL-2.0-or-later"

PV = "1.32~git.20210408.46bb4c0"

RPM_NAME = "rkdeveloptool-1.32~git.20210408.46bb4c0-2.19.aarch64.rpm"
RPM_HASH = "7324fb842f4b2c34cb79899977e15bf7c3667bd4fbd6faf1f93cb6a7122c0465da9b382b81e8dbca0720696b963af84c234c06ea9496e750a548a68cd562e776"

RPROVIDES:${PN} += "rkdeveloptool"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0 \
udev"

inherit rpm
