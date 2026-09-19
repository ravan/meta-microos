SUMMARY = "Library for Portable Interface to Low-Level Networking Routines"
DESCRIPTION = "libdnet provides a portable interface to several low-level \
networking routines, including: \
* network address manipulation \
* kernel arp(4) cache and route(4) table lookup and manipulation \
* network firewalling (IP filter, ipfw, ipchains, pf, PktFilter, ...) \
* network interface lookup and manipulation \
* IP tunnelling (BSD/Linux tun, Universal TUN/TAP device) \
* raw IP packet and Ethernet frame transmission"
LICENSE = "BSD-3-Clause"

PV = "1.18.2"

RPM_NAME = "libdnet1-1.18.2-1.3.aarch64.rpm"
RPM_HASH = "c17a72eb928db86d8507a2d185d483764483316d6c1f9133deda85979573232d32e9208e6b15507f26bfb2f8b2de08e70da5e87d3d4045a9b185f664a1b0d698"

RPROVIDES:${PN} += "libdnet.so.1 \
libdnet1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
