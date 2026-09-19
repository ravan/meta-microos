SUMMARY = "Colorful X solitaire MahJongg game"
DESCRIPTION = "Real Mah Jongg is a social game that originated in China thousands of \
years ago. Four players, named after the four winds, take tiles from a \
wall in turn. The best tiles are made of ivory and wood; they click \
pleasantly when you knock them together. Computer Solitaire Mah Jongg \
(xmahjongg being one of the sillier examples) is nothing like that but \
it's fun, or it must be, since there are like 300 shareware versions \
available for Windows. This is for X11 and it's free."
LICENSE = "GPL-2.0-or-later"

PV = "3.7"

RPM_NAME = "xmahjongg-3.7-7.13.aarch64.rpm"
RPM_HASH = "a314fea001278179959247736c3b9e094b933ebc41482b730a9e3dc2d3d0e6fb8c95868330893cebe8075261df3bc588405fbfec1f4de955deb802c86ebe05a4"

RPROVIDES:${PN} += "xmahjongg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
