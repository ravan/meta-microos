SUMMARY = "Accelerated Open Source driver for nVidia cards"
DESCRIPTION = "The nouveau project aims to build high-quality, open source drivers for nVidia \
cards. “Nouveau” [nuvo] is the French word for “new”."
LICENSE = "MIT"

PV = "1.0.18"

RPM_NAME = "xf86-video-nouveau-1.0.18-1.8.aarch64.rpm"
RPM_HASH = "d651aeba7881dce5a92097ccc7a4222c78ac91555b29700624d70bdf0c8dda0a879908d18d7ccc47d4b29d19426ae236f79536a32f8fb3a7e3cc689ac8887c36"

RPROVIDES:${PN} += "xf86-video-nouveau \
xorg-x11-driver-video-nouveau"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-nouveau.so.2 \
libdrm.so.2 \
libudev.so.1 \
xorg-x11-server"

inherit rpm
