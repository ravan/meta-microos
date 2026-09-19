SUMMARY = "QXL virtual GPU video driver for the Xorg X server"
DESCRIPTION = "qxl is an Xorg driver for QXL virtual GPU as found in the spice project."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "xf86-video-qxl-0.1.6-2.10.aarch64.rpm"
RPM_HASH = "6d6ac689fdb2e4f20b346f39297ab63fe4144f36083d21afbfb9d7c929b976c7aabc8b557f7257340cf1c6a36b5e95b0198d379132c35a57426e47f43bc23f87"

RPROVIDES:${PN} += "xf86-video-qxl"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
