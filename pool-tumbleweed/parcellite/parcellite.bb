SUMMARY = "A lightweight GTK+ clipboard manager"
DESCRIPTION = "Parcellite is a stripped down, basic-features-only clipboard manager with a \
small memory footprint for those who like simplicity. \
 \
In GNOME and Xfce, parcellite will be started automatically. For \
other desktops or window managers you should also install a panel with a \
system tray or notification area if you want to use this package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.5"

RPM_NAME = "parcellite-1.2.5-5.2.aarch64.rpm"
RPM_HASH = "bc02e63df3a92a170a0724beb0eb4e03eec13148285027461bfa965f5db9a140d24b6b6f34e4942d6bdf1094b3fe979a59c99b2f57ba38bc885630f49076ff9e"

RPROVIDES:${PN} += "config-parcellite \
parcellite"

RDEPENDS:${PN} += "/usr/bin/sh \
libX11.so.6 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0 \
xdotool"

inherit rpm
