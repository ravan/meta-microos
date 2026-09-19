SUMMARY = "TCP proxy for non-IPv6 applications"
DESCRIPTION = "6tunnel allows using services provided by IPv6 hosts with IPv4-only \
applications and vice versa. It can bind to any of the system's IPv4 \
or IPv6 addresses and forward all data to IPv4 or IPv6 hosts. \
 \
It can be used, for example, as an IPv6-capable IRC proxy."
LICENSE = "GPL-2.0-or-later"

PV = "0.14"

RPM_NAME = "6tunnel-0.14-1.3.aarch64.rpm"
RPM_HASH = "6190db13164feb2c969d5bcac3abbd11f4ad1662a788598dc7b153d5393e22f82b3dce9502a46f91894c40bf76dcd386027e5e30c8ebd46fde373a9dd5fe6fb7"

RPROVIDES:${PN} += "6tunnel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
