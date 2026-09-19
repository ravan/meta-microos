SUMMARY = "Development files for the GNOME Internal games library"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support1_3-devel-1.8.2-1.19.aarch64.rpm"
RPM_HASH = "e06fdcabcb46c7073c0eda3b4633a81ce365c7bf5c94a22070055cac756d03a23f5e8f92d4d95f0d48195c28ded0bd641e8621192dad9c4bfe26ddf24985bdce"

RPROVIDES:${PN} += "libgnome-games-support1-3-devel \
pkgconfig-libgnome-games-support-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-games-support-1-3 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
