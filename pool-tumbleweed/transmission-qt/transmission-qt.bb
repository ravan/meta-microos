SUMMARY = "Qt interface for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links. \
 \
This package contains a graphical user interface to transmission."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-qt-4.1.3-1.2.aarch64.rpm"
RPM_HASH = "3502eb825cd0892793be91754603e5bf90672d57521b20a7d23538b3b4abce256710596be7e9081e47de7cef6ce4bef9a20ba30c6f17fd5bac3b4e0fcae0fa91"

RPROVIDES:${PN} += "transmission-qt \
transmission-ui"

RDEPENDS:${PN} += "alts \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
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
