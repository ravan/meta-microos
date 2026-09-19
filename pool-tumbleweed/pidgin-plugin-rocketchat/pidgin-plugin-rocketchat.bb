SUMMARY = "RocketChat protocol plugin for Pidgin"
DESCRIPTION = "RocketChat protocol plugin for libpurple-based applications. \
 \
This package provides the icon set for Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "20260223"

RPM_NAME = "pidgin-plugin-rocketchat-20260223-1.3.noarch.rpm"
RPM_HASH = "ac96e1d7ed45ba313ce70e199dad51ebc3df6fa9fd9c2135365e5a33fe74934f88aecae44a0817e8684b18986ab202d0fe61b769690e1937b21b7039077fb9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pidgin-plugin-rocketchat"

RDEPENDS:${PN} += "libpurple-plugin-rocketchat"

inherit rpm
