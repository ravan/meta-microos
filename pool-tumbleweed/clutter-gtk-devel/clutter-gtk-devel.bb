SUMMARY = "Development files for the GTK+ Clutter integration"
DESCRIPTION = "Clutter is an open source software library for creating fast, visually \
rich and animated graphical user interfaces. \
 \
Clutter GTK+ enables the use of GTK+ with Clutter."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.4"

RPM_NAME = "clutter-gtk-devel-1.8.4-5.30.aarch64.rpm"
RPM_HASH = "8ee25ca0f3b86897b6db21b46ec70e87d3ef8d0fc18b6fa32f5ad8b9d1a8dac49e79e51755b8b22cc61a7359f927e30df46d3aebaafc8defd1fffe75f6e5373a"

RPROVIDES:${PN} += "clutter-gtk-devel \
clutter-gtk-doc \
pkgconfig-clutter-gtk-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclutter-gtk-1-0-0 \
pkgconfig-clutter-1.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-GtkClutter-1-0"

inherit rpm
