SUMMARY = "Modern, efficient menu for MATE"
DESCRIPTION = "Modern, efficient menu for the MATE Desktop Environment."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "brisk-menu-0.6.2-2.8.aarch64.rpm"
RPM_HASH = "fb8970b9e4e25fffec072b5f6514d2429ac5cb081d1e6bb76f1cb8c8742740082f897528d88860a782bed19b2c3fe1b3012987b63101072c4b13ac706dedae38"

RPROVIDES:${PN} += "brisk-menu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-menu.so.2 \
libmate-panel-applet-4.so.1 \
libnotify.so.4"

inherit rpm
