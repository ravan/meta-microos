SUMMARY = "Wacom input driver for the Xorg X server"
DESCRIPTION = "wacom is an X input driver and utilities for Wacom devices."
LICENSE = "GPL-2.0-or-later"

PV = "0.40.0"

RPM_NAME = "xf86-input-wacom-0.40.0-3.9.aarch64.rpm"
RPM_HASH = "bdf0cf71320f3fb0e37c2c3370c2c27b8b176562b957ef8654a7e4c8adcdc7a0036c19385a876cb610cccfaaad777389767f7b375483936d2813dc68f9bc8a7b"

RPROVIDES:${PN} += "x11-input-wacom \
x11-input-wacom-tools \
xf86-input-wacom"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libc.so.6 \
libm.so.6 \
libudev.so.1 \
pkgconfig-udev"

inherit rpm
