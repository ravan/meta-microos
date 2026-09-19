SUMMARY = "Daemon for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-daemon-4.1.3-1.2.aarch64.rpm"
RPM_HASH = "f2c76492e2f7a9bafd642d480a9bdd07b0c01eb8164acdcca9b4062d8933d6ac7f3550d065e669f2b673617f4842f549f2608d777ae87d0bc2bc2ffac239d99b"

RPROVIDES:${PN} += "transmission-daemon"

RDEPENDS:${PN} += "group-transmission \
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
libsystemd.so.0 \
systemd \
user-transmission"

inherit rpm
