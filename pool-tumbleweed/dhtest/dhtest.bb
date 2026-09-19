SUMMARY = "A DHCP client simulation tool"
DESCRIPTION = "dhtest - linux DHCP client simulation tool. It can simulate hundreds of DHCP \
client from a linux machine. Linux root login is needed because the tool \
requires layer2 raw socket for sending and receiving DHCP packets."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "dhtest-1.5-2.23.aarch64.rpm"
RPM_HASH = "57f121f48ab4cbea6e36dc81df3f404336ac9916be1d98e8e22a9e44e2fcd714b8de84fc45c3f3d1492e3abaf67fa6313c49be2353ac8e1e5d46a4f1e06d7aa6"

RPROVIDES:${PN} += "dhtest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
