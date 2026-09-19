SUMMARY = "Joystick input driver for the Xorg X server -- Development Files"
DESCRIPTION = "joystick is an Xorg input driver for Joysticks. The driver reports \
cursor movement as well as raw axis values through valuators."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xf86-input-joystick-devel-1.6.4-1.13.aarch64.rpm"
RPM_HASH = "4e86abd968fc27e6ed0af2dbed2e8f3a24050f841685dc15809ba9bc0bcbe064b3fcf0e16284ca5d7f0d6031117f8714990f26b0e855382f55b3f2237e45a177"

RPROVIDES:${PN} += "pkgconfig-xorg-joystick \
xf86-input-joystick-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-joystick"

inherit rpm
