SUMMARY = "A Wine and Proton-based compatibility tools manager for GNOME"
DESCRIPTION = "ProtonPlus is a Proton version manager for installing and managing Proton \
versions. It works with Steam, Lutris, Heroic Games Launcher and Bottles. It \
uses GTK4."
LICENSE = "GPL-3.0-only"

PV = "0.6.4"

RPM_NAME = "ProtonPlus-0.6.4-1.1.aarch64.rpm"
RPM_HASH = "1f1b0ac55edb6e3a6cc546366196e4a58c832120aa2d4ae72f93ad4214a6865d278954e539c1290ed8cf6f332520db8fbf7aed23ba54401677aa7070d9a71dc8"

RPROVIDES:${PN} += "ProtonPlus"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL3.so.0 \
libadwaita-1.so.0 \
libappstream.so.5 \
libarchive.so.13 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libjson-glib-1.0.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsoup-3.0.so.0"

inherit rpm
