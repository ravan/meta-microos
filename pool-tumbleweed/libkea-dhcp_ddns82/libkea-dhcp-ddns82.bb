SUMMARY = "Kea DHCP Dynamic DNS library"
DESCRIPTION = "This is a library of classes for sending and receiving requests used \
by ISC's DHCP-DDNS (aka D2) service to carry out DHCP-driven DNS \
updates."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-dhcp_ddns82-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "ab90b389ba4722d915afe1ab1f2ae0a1feeaf47c58023f2bac6b8ccb10b9588cb7874c7a3feaf2d758fee8f5fd0b98a2b9faf6531a71106bc6f8e01bf44fea4c"

RPROVIDES:${PN} += "libkea-dhcp-ddns.so.82 \
libkea-dhcp-ddns82"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-cryptolink.so.76 \
libkea-dhcp.so.129 \
libkea-dns.so.84 \
libkea-exceptions.so.55 \
libkea-log.so.86 \
libkea-stats.so.64 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
