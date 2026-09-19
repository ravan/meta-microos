SUMMARY = "Virtual/offscreen frame buffer video driver for the Xorg X server"
DESCRIPTION = "dummy is an Xorg driver for virtual/offscreen frame buffer."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xf86-video-dummy-0.4.1-1.11.aarch64.rpm"
RPM_HASH = "082cff061dc67689d8d8932dc90df23f5796861b9217972d937a2f531ddac14e45d1fffb4a793aed66059ccfbfee49fc6e4572c2e4b16e15ae83fc8ad6f2048b"

RPROVIDES:${PN} += "xf86-video-dummy"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
