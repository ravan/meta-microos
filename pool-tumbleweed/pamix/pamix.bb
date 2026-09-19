SUMMARY = "'alsamixer' for pulseaudio"
DESCRIPTION = "ncurses pulseaudio mixer similar to pavucontrol and alsamixer"
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "pamix-1.6-1.36.aarch64.rpm"
RPM_HASH = "bab4bb2c04e7ea739b9669abafbd83269344ece321f86a786fe58c6a86f5c61c4530d3558957faba930dc6fc2b5579cd25e9e146f73f86edc67e884552b7b64c"

RPROVIDES:${PN} += "config-pamix \
pamix"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
