SUMMARY = "Libvma runtime libary"
DESCRIPTION = "VMA library is a performance booster of TCP and UDP traffic \
Part of Mellanox enhanced services \
Allows application written over standard socket API \
To run over Infiniband/Ethernet from userspace with full network stack bypass \
and get better throughput, latency and packets/sec rate"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.8.84"

RPM_NAME = "libvma9-9.8.84-2.1.aarch64.rpm"
RPM_HASH = "ca570ba004dbf216d448b6da7ecf9d52de296011e4e9cf4bb1084e21ac0804dcc8c7b69e698b8036b50f7e5650af3f100a1f92cafb60475a67450c34665a4b00"

RPROVIDES:${PN} += "libvma.so.9 \
libvma9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libibverbs.so.1 \
libmlx5.so.1 \
libnl-3.so.200 \
libnl-route-3.so.200 \
librdmacm.so.1 \
libstdc++.so.6"

inherit rpm
