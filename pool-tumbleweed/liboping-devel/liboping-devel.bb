SUMMARY = "Multiple Host Ping Library that supports ICMPv4 and ICMPv6"
DESCRIPTION = "liboping is a C library for measuring network latency using ICMP echo \
requests. It can send to and receive packets from multiple hosts in parallel, \
which is nice for monitoring applications. Both IPv4 and IPv6 are supported \
transparently for the programmer and user. \
 \
This package includes the header and shared library link, required for \
building applications or libraries that use liboping. \
This package is not needed at runtime."
LICENSE = "LGPL-2.1-only"

PV = "1.10.0"

RPM_NAME = "liboping-devel-1.10.0-2.15.aarch64.rpm"
RPM_HASH = "8b9612efc4cc51fbb52608d125619a6d0203fe95aefb97e9383fb90ad3b419d74eb21389a0b662507aead25b37ba5e46e1c8a4615479d71fd51803b82d418e00"

RPROVIDES:${PN} += "liboping-devel \
pkgconfig-liboping"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liboping"

inherit rpm
