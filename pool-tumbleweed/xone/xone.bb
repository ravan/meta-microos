SUMMARY = "Driver for Xbox One and Xbox Series X|S controllers"
DESCRIPTION = "Linux kernel driver for Xbox One and Xbox Series X|S accessories. \
it serves as a modern replacement for xpad, aiming to be \
compatible with Microsoft's Game Input Protocol (GIP)."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.8"

RPM_NAME = "xone-0.5.8-1.19.aarch64.rpm"
RPM_HASH = "f26f07509a3a2a1c774fcfb2a7030bde5f38e095196a255c7eacd8acc129d6befb967034428d57672a24d65834dcc4001bdc6c32c82e157aceb69928cb8d478a"

RPROVIDES:${PN} += "xone"

RDEPENDS:${PN} += "xone-dongle-firmware \
xone-kmp"

inherit rpm
