SUMMARY = "Neomagic video driver for the Xorg X server"
DESCRIPTION = "neomagic is an Xorg driver for Neomagic video cards found in many laptop \
computers."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "xf86-video-neomagic-1.3.1-1.13.aarch64.rpm"
RPM_HASH = "9c5c5e6571309f97a4b998061bace933dc5f96681ed236c68eb154c6cd079017561a28fca3c42b770b6e3581553e69792e6b2eb9d5b1e31ab0ccd623ebd3230f"

RPROVIDES:${PN} += "xf86-video-neomagic"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
