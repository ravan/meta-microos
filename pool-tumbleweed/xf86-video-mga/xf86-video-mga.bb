SUMMARY = "Matrox video driver for the Xorg X server"
DESCRIPTION = "mga is an Xorg driver for Matrox video cards. \
 \
The driver is fully accelerated, and provides support for the following \
framebuffer depths: 8, 15, 16, 24, and an 8+24 overlay mode. All visual \
types are supported for depth 8, and both TrueColor and DirectColor \
visuals are supported for the other depths except 8+24 mode which \
supports PseudoColor, GrayScale and TrueColor. Multi-card configurations \
are supported. XVideo is supported on G200 and newer systems, with \
either TexturedVideo or video overlay. The second head of dual-head \
cards is supported for the G450 and G550. Support for the second head on \
G400 cards requires a binary-only 'mga_hal' module that is available \
from Matrox, and may be on the CD supplied with the card. That module \
also provides various other enhancements, and may be necessary to use \
the DVI (digital) output on the G550 (and other cards)."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "xf86-video-mga-2.1.0-1.9.aarch64.rpm"
RPM_HASH = "b2112f99365b0b459d76a2f218c0bd6b7cf0bde004734ce7e519510182370f80038135c253c2fb05ad39876be71f140de4ccc923b0356f7f57f7e294458f691a"

RPROVIDES:${PN} += "xf86-video-mga"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
