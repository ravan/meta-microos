SUMMARY = "Development files for the GTK+ toolkit library v4"
DESCRIPTION = "GTK+ is a multi-platform toolkit for creating graphical user interfaces. \
Offering a complete set of widgets, GTK+ is suitable for projects \
ranging from small one-off projects to complete application suites. \
 \
This package contains the development files for GTK+ 4.x."
LICENSE = "LGPL-2.1-or-later"

PV = "4.22.5"

RPM_NAME = "gtk4-devel-4.22.5-1.1.aarch64.rpm"
RPM_HASH = "c3a32bb52aecb161f505ccf85f37c47cbbcf1580e6ca1bf4de949c9c3c2a13e68b639f71e8aeaa50fb69d72cb2070408d739c60e2e2e49d5829faf0be96a33f0"

RPROVIDES:${PN} += "gtk4-devel \
pkgconfig-gtk4 \
pkgconfig-gtk4-atspi \
pkgconfig-gtk4-broadway \
pkgconfig-gtk4-unix-print \
pkgconfig-gtk4-wayland \
pkgconfig-gtk4-x11 \
rpm-macro-gtk4-immodule-post \
rpm-macro-gtk4-immodule-postun \
rpm-macro-gtk4-immodule-requires"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gettext-its-gtk4 \
gtk4-devel-tools \
gtk4-tools \
libgtk-4-1 \
pkgconfig-cairo \
pkgconfig-cairo-gobject \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-graphene-gobject-1.0 \
pkgconfig-gtk4 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-wayland-egl \
pkgconfig-x11 \
pkgconfig-xkbcommon \
typelib-1-0-Gtk-4-0"

inherit rpm
