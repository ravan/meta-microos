SUMMARY = "Kea DHCP server component library"
DESCRIPTION = "This library contains code used for the DHCPv4 and DHCPv6 servers' \
operations, including the 'Lease Manager' that manages information \
about leases and the 'Configuration Manager' that stores the servers' \
configuration etc."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-dhcpsrv149-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "eec5553d6929f40fe02b389932414d0e277f17f73bdd420987334defad550d8eb01dae94cfde25c73024e203f2b810a335f33778f9c369727ce63cde034de645"

RPROVIDES:${PN} += "libkea-dhcpsrv.so.149 \
libkea-dhcpsrv149"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-config.so.98 \
libkea-cryptolink.so.76 \
libkea-database.so.88 \
libkea-dhcp-ddns.so.82 \
libkea-dhcp.so.129 \
libkea-eval.so.97 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-log.so.86 \
libkea-process.so.105 \
libkea-stats.so.64 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
