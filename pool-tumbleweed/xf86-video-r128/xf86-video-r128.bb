SUMMARY = "ATI Rage 128 video driver for the Xorg X server"
DESCRIPTION = "r128 is an Xorg driver for ATI Rage 128 video cards. \
 \
It contains full support for 8, 15, 16 and 24 bit pixel depths, hardware \
acceleration of drawing primitives, hardware cursor, video modes up to \
1800x1440 @ 70Hz, doublescan modes (e.g., 320x200 and 320x240), gamma \
correction at all pixel depths, a fully programming dot clock and robust \
text mode restoration for VT switching. Dualhead is supported on M3/M4 \
mobile chips."
LICENSE = "MIT"

PV = "6.13.0"

RPM_NAME = "xf86-video-r128-6.13.0-1.9.aarch64.rpm"
RPM_HASH = "76c4c4174ff8d8551c446613903a7b37dbb7d66093fd6f64b21457e20b1d54d2b7ca659e4929c5b01a015d9811ffe09d50f1ad69b8d7eb644581d1069092f4f9"

RPROVIDES:${PN} += "xf86-video-r128"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
