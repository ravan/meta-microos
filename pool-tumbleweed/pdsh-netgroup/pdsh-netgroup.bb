SUMMARY = "Netgroup plugin for pdsh"
DESCRIPTION = "Plugin for pdsh to determine nodes to run on from netgroups."
LICENSE = "GPL-2.0-or-later"

PV = "2.36"

RPM_NAME = "pdsh-netgroup-2.36-1.2.aarch64.rpm"
RPM_HASH = "167f73878174ff38f12c95640281392567a1f94f4e2730b666a6bbe9d02afc0163b156adba1eaa471d1d641436c86ca761f089a6de1ffd07bcb3536a91954130"

RPROVIDES:${PN} += "pdsh-netgroup"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pdsh"

inherit rpm
