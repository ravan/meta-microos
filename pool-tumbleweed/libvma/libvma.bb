SUMMARY = "A library for boosting TCP and UDP traffic (over RDMA hardware)"
DESCRIPTION = "VMA library is a performance booster of TCP and UDP traffic \
Part of Mellanox enhanced services \
Allows application written over standard socket API \
To run over Infiniband/Ethernet from userspace with full network stack bypass \
and get better throughput, latency and packets/sec rate"
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.8.84"

RPM_NAME = "libvma-9.8.84-2.1.aarch64.rpm"
RPM_HASH = "7b79d10e79b607aeb0f2d20f48eaee2ca152759de460c1e993d754f714929767f02702f51c30293f78caf89a64fa0264c2d2d331185eae9f21cb6e1264f62050"

RPROVIDES:${PN} += "config-libvma \
libvma"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libvma9"

inherit rpm
