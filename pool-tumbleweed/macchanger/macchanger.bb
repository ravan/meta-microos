SUMMARY = "Utility for viewing/manipulating the MAC address of network interfaces"
DESCRIPTION = "A GNU/Linux utility for viewing/manipulating the MAC address of network interfaces."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.0"

RPM_NAME = "macchanger-1.7.0-2.4.aarch64.rpm"
RPM_HASH = "40e2c84ef6c1c8ac715ac5c0e2e0371a22bd40056c90b77e485a8b57365820b35e0bae1da7a7e5f37508a1970730ba797efb856cfe38f84c43ee09f7c17d2255"

RPROVIDES:${PN} += "macchanger"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
