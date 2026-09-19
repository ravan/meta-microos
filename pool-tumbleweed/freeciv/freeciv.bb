SUMMARY = "Free Civilization Clone"
DESCRIPTION = "A clone of the well known game Civilization by Microprose. \
 \
Every player is the leader of an imaginary nation. The aim of the game \
can be to create a prospering civilization with commerce and knowledge \
exchange or (more often) the extinction of all other civilizations. \
 \
To start a new game, first start the server 'civserver,' then start the \
client 'civclient'. Have fun!"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "freeciv-3.2.6-2.1.aarch64.rpm"
RPM_HASH = "4ae1f2503d3455446de8473b3068744b402c5831294ea362c741eb3fdb8904f55a7a0510ede63c3011f4612d158628e7ca039d7fad3f88307ebf9ecfc60be090"

RPROVIDES:${PN} += "config-freeciv \
freeciv \
libfreeciv.so"

RDEPENDS:${PN} += "freeciv-client-3.2.6 \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libicuuc.so.78 \
liblua5.4.so.5 \
liblzma.so.5 \
libm.so.6 \
libreadline.so.8 \
libsqlite3.so.0 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
