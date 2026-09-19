SUMMARY = "ATI Mach64 series video driver for the Xorg X server"
DESCRIPTION = "mach64 is an Xorg driver for ATI Mach64 series video cards."
LICENSE = "MIT"

PV = "6.10.0"

RPM_NAME = "xf86-video-mach64-6.10.0-1.9.aarch64.rpm"
RPM_HASH = "88125a0feb57b2b7d6a383ff84352b4a9b8aabf71c6b49b4335ff9d17789df08f1e5bd2cb85f47fa94f509be670a01a90b2793a416acccb8d848e947c92c2f09"

RPROVIDES:${PN} += "xf86-video-mach64"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
