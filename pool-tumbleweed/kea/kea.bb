SUMMARY = "Dynamic Host Configuration Protocol daemon"
DESCRIPTION = "Kea is a new DHCPv4/DHCPv6 server being developed by ISC in C++, a \
continuation of the DHCP server in the (ended) BIND10 project. The \
objective of this project is to provide a very high-performance, \
extensible DHCP server engine for use by enterprises and service \
providers, either as-is or with extensions and modifications."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "kea-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "b570e063ee8f3e63794fcfcd1119101eac65ab91cbdf919aca45a8ed85d8880d7944918fc9e1c5d4e20cd6ead2056c309af9d7091e87d6bf5e1709039db214c5"

RPROVIDES:${PN} += "config-kea \
group-keadhcp \
kea \
user-keadhcp"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.105 \
libkea-cc.so.98 \
libkea-cfgrpt.so.3 \
libkea-config.so.98 \
libkea-cryptolink.so.76 \
libkea-d2srv.so.75 \
libkea-database.so.88 \
libkea-dhcp-ddns.so.82 \
libkea-dhcp.so.129 \
libkea-dhcpsrv.so.149 \
libkea-dns.so.84 \
libkea-eval.so.97 \
libkea-exceptions.so.55 \
libkea-hooks.so.139 \
libkea-log.so.86 \
libkea-process.so.105 \
libkea-stats.so.64 \
libkea-util.so.118 \
libm.so.6 \
libstdc++.so.6 \
sysuser-shadow"

inherit rpm
