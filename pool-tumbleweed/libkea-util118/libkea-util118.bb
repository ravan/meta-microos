SUMMARY = "Kea utility function library"
DESCRIPTION = "One of the many libraries the Kea DHCP server is composed of."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-util118-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "e5440312218d04b3666bf431aadba011c45c49f487f40b32a206ba6a9f5da04a1930718b80e2bae4d6b9fb375c061d0947bd34b86e6be3e39b47132eb4eebc4c"

RPROVIDES:${PN} += "libkea-util.so.118 \
libkea-util118"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-exceptions.so.55 \
libstdc++.so.6"

inherit rpm
