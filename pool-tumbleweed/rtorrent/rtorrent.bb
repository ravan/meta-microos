SUMMARY = "Console-based BitTorrent client"
DESCRIPTION = "rTorrent is a text-based BitTorrent client written in C++ and with \
ncurses. It supports fast resume and session management, and can be \
run in the background with the help of e.g. GNU screen."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.16.22"

RPM_NAME = "rtorrent-0.16.22-1.1.aarch64.rpm"
RPM_HASH = "1a84b89ee04ebb21ca9313b58b4402b130876682e2f735869ba84dc4c3a458c644710af5e5802b175d12ab272ee9d9eb9b9f92cefad24415e1a0d6bf7e48aa44"

RPROVIDES:${PN} += "bundled-tinyxml2 \
group-rtorrent \
rtorrent \
user-rtorrent"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libtorrent.so.50 \
libz.so.1 \
sysuser-shadow"

inherit rpm
