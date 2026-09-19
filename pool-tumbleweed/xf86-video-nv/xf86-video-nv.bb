SUMMARY = "NVIDIA video driver for the Xorg X server"
DESCRIPTION = "nv is an Xorg driver for NVIDIA video cards. \
 \
The driver supports 2D acceleration and provides support for the \
following framebuffer depths: 8, 15, 16 (except Riva128) and 24. All \
visual types are supported for depth 8, TrueColor and DirectColor \
visuals are supported for the other depths with the exception of the \
Riva128 which only supports TrueColor in the higher depths."
LICENSE = "MIT"

PV = "2.1.24"

RPM_NAME = "xf86-video-nv-2.1.24-1.3.aarch64.rpm"
RPM_HASH = "7d96db1e5f8673bcc77da1f514e3e28fece1e89dede851e21eccee503220461373f2f09929ab40cdfb9fc4114602f4123a1805e9f42420053e169887b379d664"

RPROVIDES:${PN} += "xf86-video-nv \
xorg-x11-driver-video-nvidia"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
