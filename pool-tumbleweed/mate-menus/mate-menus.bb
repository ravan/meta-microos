SUMMARY = "MATE Desktop Menu"
DESCRIPTION = "mate-menus contains the libmate-menu library, the layout \
configuration files for the MATE menu, as well as a simple menu \
editor. \
 \
The libmate-menu library implements the 'Desktop Menu Specification' \
from freedesktop.org."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.0"

RPM_NAME = "mate-menus-1.28.0-2.5.aarch64.rpm"
RPM_HASH = "8b458fc0657dedeff10c4cc7243c5cb79fa28ed7dc8ae8bf4aac736d7bfd7b68ee5f246458464590399629ec2379b991416fb86b6bdef9368c0a2e41f2d4748b"

RPROVIDES:${PN} += "mate-menus"

RDEPENDS:${PN} += "mate-menus-branding"

inherit rpm
