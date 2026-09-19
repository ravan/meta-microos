SUMMARY = "'Five or More' Game for GNOME"
DESCRIPTION = "Five or More is a game where one must align colored pieces as the \
board gets filled with randomly placed pieces. When five or more \
pieces of the same color get lined up, they disappear. The game ends \
when the board gets filled up all the way. \
 \
This package provides the binary, manual and data files for Five or More."
LICENSE = "GPL-2.0-or-later"

PV = "48.1+6"

RPM_NAME = "five-or-more-48.1+6-1.2.aarch64.rpm"
RPM_HASH = "adf924f4060deda9011dfef87648e01b673028d8483859e1d5291b58e7a34ccc06cdee98d04404b023803350240291170e45e7ccc487d0d7238401d4b731dcf3"

RPROVIDES:${PN} += "five-or-more"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-games-support-1.so.3 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
librsvg-2.so.2"

inherit rpm
