SUMMARY = "Developer package for D-Bus/GLib bindings"
DESCRIPTION = "D-Bus add-on library to integrate the standard D-Bus library with the \
GLib thread abstraction and main loop. \
 \
This package contains the devel and header files."
LICENSE = "AFL-2.1 | GPL-2.0-or-later"

PV = "0.114"

RPM_NAME = "dbus-1-glib-devel-0.114-1.3.aarch64.rpm"
RPM_HASH = "aed004b4bc76b74faf73a1d4bc0ccea2c5ff126b68cb96677d19668c9bae67e080171c1cd53ee746c422e64cb682d9477246dc8af2e9449f5acf4fc45d8f3e5a"

RPROVIDES:${PN} += "dbus-1-glib-devel \
pkgconfig-dbus-glib-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
dbus-1-glib-tool \
libdbus-glib-1-2 \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
