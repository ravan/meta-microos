SUMMARY = "SIP Swiss Army Knife"
DESCRIPTION = "Sipsak is a small command line tool for developers and administrators \
of Session Initiation Protocol (SIP) applications. It can be used for \
some simple tests on SIP applications and devices, including sending \
OPTIONS requests, sending text files with SIP requests, traceroute, \
user location test, flooding test, etc"
LICENSE = "GPL-2.0-only"

PV = "0.9.8.1"

RPM_NAME = "sipsak-0.9.8.1-1.22.aarch64.rpm"
RPM_HASH = "4bad2f8b4f9356b6ba215cf774ab282b53cccf9768851fc2fb86159b5bd6b25431dda39eebbb3af4a3862cc6cc992c53fc02e4d80844e8beef0fc5fbd549fdd9"

RPROVIDES:${PN} += "sipsak"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3"

inherit rpm
