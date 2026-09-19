SUMMARY = "Synaptics touchpad input driver for the Xorg X server"
DESCRIPTION = "synaptics is an Xorg input driver for touchpads. \
 \
Even though touchpads can be handled by the normal evdev or mouse \
drivers, this driver allows more advanced features of the touchpad to \
become available."
LICENSE = "MIT"

PV = "1.10.0"

RPM_NAME = "xf86-input-synaptics-1.10.0-1.8.aarch64.rpm"
RPM_HASH = "0e16dba252d0fdbe2ecd90c728aef6ac88f434cb8ae21caed504e195c1016c993fec92d3841e30f16b21bc3b44072b6d34bb3be9c8d6b5f32493644cc7b45d24"

RPROVIDES:${PN} += "x11-input-synaptics \
xf86-input-synaptics"

RDEPENDS:${PN} += "/usr/bin/sh \
X11-ABI-XINPUT \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXi.so.6 \
libXtst.so.6 \
libc.so.6 \
libevdev.so.2 \
libm.so.6 \
udev"

inherit rpm
