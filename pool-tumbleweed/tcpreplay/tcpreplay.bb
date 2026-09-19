SUMMARY = "Network analysis and testing tools"
DESCRIPTION = "Tcpreplay is a suite of utilities for editing and replaying \
previously captured network traffic. It was originally designed to \
replay malicious traffic patterns to Intrusion Detection/Prevention \
Systems, and is meanwhile capable of replaying to web servers. It \
supports switches, routers and IP Flow/NetFlow appliances."
LICENSE = "GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "tcpreplay-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "b2a1023014cfc7e263d115cfd888878012475ac6d88f86f8aedff61d9d3fa784095da5f986f3143e2411591f0a26890eb87048b384a5ea885a6db9f0ac4635ab"

RPROVIDES:${PN} += "tcpreplay"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdnet.so.1 \
libpcap.so.1 \
tcpdump"

inherit rpm
