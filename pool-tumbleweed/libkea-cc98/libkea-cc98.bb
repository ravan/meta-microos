SUMMARY = "Kea DHCP server command channel library"
DESCRIPTION = "libkea-cc is used for the control channel protocol between keactrl \
and the server."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-cc98-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "bf91377eb14f3a30a2434131ed66a0ee3b1963ff6e702669b09ce19f7b9a6d887a661c775a68c1ce8940bb7288795f939cd12b2d2b60d8e9b28e5399bec0a1e3"

RPROVIDES:${PN} += "libkea-cc.so.98 \
libkea-cc98"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-exceptions.so.55 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
