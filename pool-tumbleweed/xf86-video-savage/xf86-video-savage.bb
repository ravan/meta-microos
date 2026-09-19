SUMMARY = "S3 Savage video driver for the Xorg X server"
DESCRIPTION = "savage is an Xorg driver for S3 Savage video cards. \
 \
2D, 3D, and Xv acceleration is supported on all chips except the \
Savage2000 (2D only). Dualhead operation is supported on MX, IX, and \
SuperSavage chips."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "xf86-video-savage-2.4.1-1.9.aarch64.rpm"
RPM_HASH = "196b005e55bfa6dfa312dc1ce29ff5bcba8489e432fab1c2687edb17c713f503a49a7c2f14b11f15a656d6ebed8d9407a5501a421aa2010e15f75adf2806210d"

RPROVIDES:${PN} += "xf86-video-savage"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
