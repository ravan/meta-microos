SUMMARY = "ALSA Scarlett Gen 2/3/4 Control Panel"
DESCRIPTION = "A Gtk4 GUI for the ALSA controls presented by the Linux kernel Focusrite Scarlett2 USB Protocol Mixer Driver."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "1.0.0~b7"

RPM_NAME = "alsa-scarlett-gui-1.0.0~b7-1.2.aarch64.rpm"
RPM_HASH = "761b81ce9cf0ca76590e4281463156d8dec2658c3478f38a547eac60946b5c0f3dca72e642a13670d419bd2e1730b1dc5b24fed56c022f88d521dbc788db25d7"

RPROVIDES:${PN} += "alsa-scarlett-gui"

RDEPENDS:${PN} += "libasound.so.2 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
