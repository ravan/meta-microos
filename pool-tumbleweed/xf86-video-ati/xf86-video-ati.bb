SUMMARY = "ATI video driver for the Xorg X server"
DESCRIPTION = "ati is an Xorg driver for ATI/AMD video cards. \
 \
It autodetects whether your hardware has a Radeon, Rage 128, or Mach64 \
or earlier class of chipset, and loads the radeon, r128, or mach64 \
driver as appropriate."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "xf86-video-ati-22.0.0-1.11.aarch64.rpm"
RPM_HASH = "c104e0327160a4dc9c651c8b1fc27767fe9dc6d24e7fbcf95d966ccfedcc347fa594f9e86c6c1049df7de738e72ed72dcc6d3d20ecf93781248c2d7fdb351c0b"

RPROVIDES:${PN} += "xf86-video-ati"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdrm-radeon.so.1 \
libgbm.so.1 \
libpciaccess.so.0 \
libudev.so.1"

inherit rpm
