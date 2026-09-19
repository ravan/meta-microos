SUMMARY = "Tetris Game for GNOME"
DESCRIPTION = "Quadrapassel is a version of Tetris, the classic game of interlocking \
four-piece blocks. As they fall from the top, the player must orient \
them to fit the other blocks at the bottom so that they form a \
complete horizontal line, in which case that line disappears and the \
player gains points"
LICENSE = "GPL-3.0-or-later"

PV = "50.2"

RPM_NAME = "quadrapassel-50.2-1.2.aarch64.rpm"
RPM_HASH = "b3053b9a47c74c71313e7c5935b51a04f19186e987e187255de438e0297113db7c7edc4fe43a761cddc577ccccef76ea2b97cec19ccedd81b0039420d9bef219"

RPROVIDES:${PN} += "quadrapassel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libmanette-0.2.so.0 \
libopenal.so.1 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsndfile.so.1"

inherit rpm
