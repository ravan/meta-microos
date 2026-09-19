SUMMARY = "Joystick input driver for the Xorg X server"
DESCRIPTION = "joystick is an Xorg input driver for Joysticks. The driver reports \
cursor movement as well as raw axis values through valuators."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "xf86-input-joystick-1.6.4-1.13.aarch64.rpm"
RPM_HASH = "900ba02ace2b3555e211e2e118823ac0a2cb4571797fa5e820abadd00628c8c0614cccaacaa9e2e4849d91c71a81473d192eeb0570fa994f03954f153daa5be0"

RPROVIDES:${PN} += "xf86-input-joystick"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libc.so.6 \
udev"

inherit rpm
