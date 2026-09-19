SUMMARY = "Development files for the GNOME software store"
DESCRIPTION = "This subpackage contains the header files for developing \
GNOME software store plugins."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-software-devel-50.4-1.1.aarch64.rpm"
RPM_HASH = "c9c3bc0c72ec5eee5ea7b1ac030da509a6f31c4b11e99d8f6ed20bbbc30f825992b8db37b9c8e0edffd8a9fa5bee7e33b80764a3c4e45cd7ed4bf8fabc29869e"

RPROVIDES:${PN} += "gnome-software-devel \
pkgconfig-gnome-software"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-software \
pkgconfig-appstream \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk4 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-polkit-gobject-1 \
pkgconfig-xmlb"

inherit rpm
