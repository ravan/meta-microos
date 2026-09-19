SUMMARY = "Athena-based Minesweeper clone"
DESCRIPTION = "xbomb is a Minesweeper game using the X11 Athena widget set. It can \
be played with the traditional square tiling, and also offers \
hexagonal and triangle tiling."
LICENSE = "GPL-2.0-or-later"

PV = "2.2b"

RPM_NAME = "xbomb-2.2b-2.13.aarch64.rpm"
RPM_HASH = "b32797ca9cc881c2ad2081c37cc35c105fdbd643908794c60dcdd1981e1cce906f7c953f04eca1c3465fd673bfcb9a13ef849e46a12b39ebea8f9f8ea5f409b1"

RPROVIDES:${PN} += "xbomb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm
