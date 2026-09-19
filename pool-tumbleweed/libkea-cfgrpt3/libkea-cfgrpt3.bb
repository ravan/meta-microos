SUMMARY = "Kea DHCP server config report library"
DESCRIPTION = "The cfgrpt library is used for generating configuration reports for Kea, \
providing detailed JSON-formatted summaries of the server's current \
configuration."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-cfgrpt3-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "144dd8cd4ad47a28d1598a4651a8f9785a41e5caa9fc08da5b5de73fb72885eb9352f36d7345c874184c9a700b36572207e86f254fbd33b14f2157ce6c609288"

RPROVIDES:${PN} += "libkea-cfgrpt.so.3 \
libkea-cfgrpt3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
