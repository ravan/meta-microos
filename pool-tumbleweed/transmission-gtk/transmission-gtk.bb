SUMMARY = "GTK client for the 'transmission' BitTorrent client"
DESCRIPTION = "Transmission is a BitTorrent client. It has GTK+ and Qt GUI clients, \
a daemon for servers and headless use, and both can be remote \
controlled by HTTP and the terminal. It supports Local Peer \
Discovery, DHT, µTP, PEX and magnet links. \
 \
This package contains a graphical user interface to transmission."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & MIT"

PV = "4.1.3"

RPM_NAME = "transmission-gtk-4.1.3-1.2.aarch64.rpm"
RPM_HASH = "ecd405a9cda0bd32359687c0145a735e302dff51211545d1b9a27a18ac02be7d779310210b4013233ef4988a9c4d071784afeb51a39b52431791e245dfa16e5f"

RPROVIDES:${PN} += "transmission-gtk \
transmission-ui"

RDEPENDS:${PN} += "alts \
canberra-gtk-play \
ld-linux-aarch64.so.1 \
libb64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libdeflate.so.0 \
libevent-2.1.so.7 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libgiomm-2.68.so.1 \
libglib-2.0.so.0 \
libglibmm-2.68.so.1 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libgtkmm-4.0.so.0 \
libm.so.6 \
libminiupnpc.so.21 \
libpangomm-2.48.so.1 \
libpsl.so.5 \
libsigc-3.0.so.0 \
libstdc++.so.6 \
transmission-common"

inherit rpm
