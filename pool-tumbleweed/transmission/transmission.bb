SUMMARY = "A BitTorrent client with multiple UIs"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-4.1.3-1.2.aarch64.rpm"
RPM_HASH = "4931a013d80dac9cbdbf293c3f06f0a707383d998bf00d60c74c23f3c4ce4a75803e23949390be1bf79f6be5386cf62f7cc722b4da702c23b56258bcabf40b7d"

RPROVIDES:${PN} += "transmission \
transmission-ui"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libb64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libdeflate.so.0 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libm.so.6 \
libminiupnpc.so.21 \
libpsl.so.5 \
libstdc++.so.6 \
transmission-common"

inherit rpm
