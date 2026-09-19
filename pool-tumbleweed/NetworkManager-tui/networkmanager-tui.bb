SUMMARY = "NetworkManager curses-based UI"
DESCRIPTION = "This adds a curses-based 'TUI' (Text User Interface) to \
NetworkManager, to allow performing some of the operations supported \
by nm-connection-editor and nm-applet in a non-graphical environment."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-tui-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "12406611ae874cddbaab233f8d6eaafb9462f9ab4879c9bfed434160f050ad4312abb9e8a89bdac5ca46c1f66ec8b309b67b631aa7305bf7ea14ab8d85359f53"

RPROVIDES:${PN} += "NetworkManager-tui"

RDEPENDS:${PN} += "NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libnewt.so.0.52 \
libnm.so.0 \
libnm0"

inherit rpm
