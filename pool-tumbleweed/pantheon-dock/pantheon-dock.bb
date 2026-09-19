SUMMARY = "Quick app launcher and window switcher for Pantheon"
DESCRIPTION = "A quick app launcher and window switcher for the Pantheon Desktop Environment."
LICENSE = "GPL-3.0-or-later"

PV = "8.3.3"

RPM_NAME = "pantheon-dock-8.3.3-1.2.aarch64.rpm"
RPM_HASH = "00aa50ba75a246672c41767497b685d8e7a8b890bded6a5ab193bdfdb0d33b33b2306a1f05f7cb4112b826fd5875fa3c7f8529df2c3432d34175c8ced39fc2a2"

RPROVIDES:${PN} += "pantheon-dock"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libwayland-client.so.0"

inherit rpm
