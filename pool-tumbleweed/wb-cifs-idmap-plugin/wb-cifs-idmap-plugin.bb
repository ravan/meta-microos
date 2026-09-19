SUMMARY = "The Winbind plugin for cifs.idmap"
DESCRIPTION = "The cifs.idmap(8) userspace helper relies on a plugin to handle the ID mapping. \
This package contains the Winbind ID mapping plugin."
LICENSE = "GPL-3.0-or-later"

PV = "7.7"

RPM_NAME = "wb-cifs-idmap-plugin-7.7-2.1.aarch64.rpm"
RPM_HASH = "88f023db9fd283cca12a6c30dfe866e1507c6ef04fcecb9e69693aa3ce25772da9cc10d68eb9b027b340ea2c2bcada2d0a10b8fc0be098c298694789c6230dd4"

RPROVIDES:${PN} += "cifs-idmap-plugin \
wb-cifs-idmap-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libwbclient.so.0"

inherit rpm
