SUMMARY = "Development files for the Adwaita library"
DESCRIPTION = "Building blocks for modern GNOME applications. \
This package provides the development files for libadwaita."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.3"

RPM_NAME = "libadwaita-devel-1.9.3-1.1.aarch64.rpm"
RPM_HASH = "261185570cfd9ee395da1846df36e95ee38faab872f92b71c1f7b3eb14f7ef1e5e0565c95827eec8eae323f31b8b3ccc18498af98bbeaa44ca698ab441e5c9f3"

RPROVIDES:${PN} += "libadwaita-devel \
pkgconfig-libadwaita-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libadwaita-1-0 \
pkgconfig-appstream \
pkgconfig-fribidi \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk4 \
typelib-1-0-Adw-1"

inherit rpm
