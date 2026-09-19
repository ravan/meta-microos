SUMMARY = "Userspace daemon for using joy-cons with the hid-nintendo kernel driver"
DESCRIPTION = "joycond is a Linux daemon which uses evdev devices provided by \
hid-nintendo (formerly known as hid-joycon) to implement joycond \
pairing."
LICENSE = "GPL-3.0-or-later"

PV = "1+git20250412.39d5728"

RPM_NAME = "joycond-1+git20250412.39d5728-1.6.aarch64.rpm"
RPM_HASH = "9307baa2df458c94ae4d15ec1e1ae85d7bd1811d0cdee304b7e517b2468b86227da8ec5464dea96cd8dd2d467b336f0b531a7e979185744223c6b9a2ea5d2879"

RPROVIDES:${PN} += "joycond"

RDEPENDS:${PN} += "/usr/bin/sh \
kmod-hid-nintendo.ko \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libgcc-s.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
