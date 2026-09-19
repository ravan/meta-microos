SUMMARY = "Library to access Blu-Ray disk - Utilities"
DESCRIPTION = "This library is written for the purpose of playing Blu-ray movies. It is \
intended for software that want to support Blu-ray playback (such as VLC and \
MPlayer). We, the authors of this library, do not condone nor endorse piracy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libbluray-tools-1.4.1-1.3.aarch64.rpm"
RPM_HASH = "1cf4c78dad1582b5c708687d36cb65f1a687576359a3f9225fcc1061eca3993fde849263db12f1b245b81b0c408ed62e085a64b90fcfc382996a91bb855b83d8"

RPROVIDES:${PN} += "libbluray-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbluray.so.3 \
libc.so.6"

inherit rpm
