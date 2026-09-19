SUMMARY = "Generic Linux input driver for the Xorg X server"
DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event devices. It \
therefore supports all input devices that the kernel knows about, \
including most mice, keyboards, tablets and touchscreens."
LICENSE = "MIT"

PV = "2.11.0"

RPM_NAME = "xf86-input-evdev-2.11.0-1.9.aarch64.rpm"
RPM_HASH = "4717c5c7f904dbb041306582d188ed394fc930583704a817b62bb8e9cf2bb2ed222d1e24f49d9db7bd708430e6a6a3080a0a9cd8fad7669ae24036a6ae6b7f73"

RPROVIDES:${PN} += "x11-input-mtrack \
xf86-input-evdev"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libmtdev.so.1 \
libudev.so.1 \
udev"

inherit rpm
