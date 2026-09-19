SUMMARY = "Generic Linux input driver for the Xorg X server -- Development Files"
DESCRIPTION = "evdev is an Xorg input driver for Linux's generic event devices. It \
therefore supports all input devices that the kernel knows about, \
including most mice, keyboards, tablets and touchscreens."
LICENSE = "MIT"

PV = "2.11.0"

RPM_NAME = "xf86-input-evdev-devel-2.11.0-1.9.aarch64.rpm"
RPM_HASH = "a8aad31b31d668a91769b2330441099508ef80cf10195d11c02c08d321707b882ae4a5467baba34366ec9d079a87c104fa54f05f4edff72e0e821937d7f5b2d7"

RPROVIDES:${PN} += "pkgconfig-xorg-evdev \
xf86-input-evdev-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
xf86-input-evdev"

inherit rpm
