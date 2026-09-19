SUMMARY = "MATE module API library development files"
DESCRIPTION = "This package contains the library with common API for various MATE modules."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "1.28.2"

RPM_NAME = "mate-desktop-devel-1.28.2-1.13.aarch64.rpm"
RPM_HASH = "8fa9c1dc81f8bdf6a310ba9bc8024373553a9716616ef883259750af04104ffd08b82b422ba6123733fc2846c809689f81b2d55a71433c7558d39632d9ee70d7"

RPROVIDES:${PN} += "mate-desktop-devel \
pkgconfig-mate-desktop-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-desktop-2-17 \
pkgconfig-dconf \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-iso-codes \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-x11 \
pkgconfig-xrandr"

inherit rpm
