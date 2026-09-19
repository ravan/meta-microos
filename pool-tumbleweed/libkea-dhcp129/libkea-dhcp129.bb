SUMMARY = "Kea DHCP library"
DESCRIPTION = "libdhcp is an all-purpose DHCP-manipulation library, written in \
C++. It offers packet parsing and assembly, DHCPv4 and DHCPv6 options \
parsing and assembly, interface detection, and socket operations It \
can be used by server, client, relay, performance tools and other \
DHCP-related tools. For a server-specific library, see \
libkea-dhcpsrv."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-dhcp129-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "9dba8e1b7c566da822a25f734dcdc1b4c8fc7b6ce15b445fa0d366edd32d9f4f068028f8ef25038969fc79154cfb910080f59356461a0c457fc441c457eecd52"

RPROVIDES:${PN} += "libkea-dhcp.so.129 \
libkea-dhcp129"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-dns.so.84 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-log.so.86 \
libkea-util.so.118 \
libstdc++.so.6"

inherit rpm
