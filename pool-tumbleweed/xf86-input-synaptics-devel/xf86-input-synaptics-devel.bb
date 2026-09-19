SUMMARY = "Synaptics touchpad input driver for the Xorg X server -- Development Files"
DESCRIPTION = "synaptics is an Xorg input driver for touchpads. \
 \
Even though touchpads can be handled by the normal evdev or mouse \
drivers, this driver allows more advanced features of the touchpad to \
become available."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "xf86-input-synaptics-devel-1.10.0-1.8.aarch64.rpm"
RPM_HASH = "b571fba43ed17de6b090f8d38107764fefbdd4547b12aa1f6c3f67f8c41f85ff301b6c2b105906ee234e23fbfe53ba3a59365732ffc4f155516515b32c726aad"

RPROVIDES:${PN} += "pkgconfig-xorg-synaptics \
xf86-input-synaptics-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
