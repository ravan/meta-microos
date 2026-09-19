SUMMARY = "802.1q VLAN Implementation for Linux"
DESCRIPTION = "An 802.1q vlan implementation for Linux. See \
http://www.candelatech.com/~greear/vlan.html for more information."
LICENSE = "GPL-2.0-or-later"

PV = "1.9"

RPM_NAME = "vlan-1.9-144.11.aarch64.rpm"
RPM_HASH = "da1d3a063dd3976202807ecfa286d707fda7ec0274199d1ba777cf72a9433f11f27461e814895dc4579f94008e57c3b57f433ea10ea69e9867e8967fefa7efa7"

RPROVIDES:${PN} += "vlan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
