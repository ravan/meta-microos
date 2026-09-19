SUMMARY = "SiS and XGI video driver for the Xorg X server"
DESCRIPTION = "sis is an Xorg driver for SiS (Silicon Integrated Systems) and XGI video \
cards. \
 \
The driver is accelerated and provides support for colordepths of 8, 16 \
and 24 bpp. XVideo, Render and other extensions are supported as well."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.9.7"

RPM_NAME = "xf86-video-sisusb-0.9.7-1.39.aarch64.rpm"
RPM_HASH = "002bf24ec5760a7c7f2cb958eb25834767cf526915fcbbcb79216291ca7e5b703b96fb2c291a9a1c28b029b7687440c65380374c98b3d8ce2f5c20fa654bb05c"

RPROVIDES:${PN} += "xf86-video-sisusb"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
