SUMMARY = "GUI display configurator for wlroots compositors"
DESCRIPTION = "wdisplays is a graphical application for configuring displays in \
Wayland compositors. It requires a compositor with the \
wlr-output-management-unstable-v1 protocol, e.g. sway. \
This program can perform adjustment of display settings in \
kiosks, digital signage, and other elaborate multi-monitor setups."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.3"

RPM_NAME = "wdisplays-1.1.3-1.6.aarch64.rpm"
RPM_HASH = "203d4ac477d8e352d4b0b8b96f70fe854d219c16fc04c11c633e78d9b69222cfd4ab118176bf96539f184a9a6352fe55094cc1c76bd369ec8fbb4ee1b3647746"

RPROVIDES:${PN} += "wdisplays"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libepoxy.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libwayland-client.so.0"

inherit rpm
