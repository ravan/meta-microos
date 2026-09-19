SUMMARY = "MATE Weather development files"
DESCRIPTION = "libmateweather is a library to access weather information from \
online services for numerous locations."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.28.2"

RPM_NAME = "libmateweather-devel-1.28.2-1.4.aarch64.rpm"
RPM_HASH = "1df253b38623666ab5c0dd042799f2cc2deb65fcf246a7a2dbfd3f69eadbcf3342d77c4c64b338138c82d13a59ca7bd04f1d00eea441734c14aa227382d6685e"

RPROVIDES:${PN} += "libmateweather-devel \
pkgconfig-mateweather"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmateweather1 \
mateweather-common \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libsoup-2.4 \
pkgconfig-libxml-2.0"

inherit rpm
