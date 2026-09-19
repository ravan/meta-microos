SUMMARY = "Development files for libdnet"
DESCRIPTION = "libdnet provides a portable interface to several low-level \
networking routines, including: \
- network address manipulation \
- kernel arp(4) cache and route(4) table lookup and manipulation \
- network firewalling (IP filter, ipfw, ipchains, pf, PktFilter, ...) \
- network interface lookup and manipulation \
- IP tunnelling (BSD/Linux tun, Universal TUN/TAP device) \
- raw IP packet and Ethernet frame transmission"
LICENSE = "BSD-3-Clause"

PV = "1.18.2"

RPM_NAME = "libdnet-devel-1.18.2-1.3.aarch64.rpm"
RPM_HASH = "a899001dec237b8fcce8a4ceef92640e4054c7b643b38b754f7e0eea729c20332cc57b26f696ac7837db2a49902137bc193a278a36282e6483ed95785bcec18c"

RPROVIDES:${PN} += "libdnet-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc-devel \
libdnet1"

inherit rpm
