SUMMARY = "Development package for libjcat"
DESCRIPTION = "Files for development with libjcat."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libjcat-devel-0.2.6-2.1.aarch64.rpm"
RPM_HASH = "8b138cb1bf4b92bfe434ff6afe0af8c572509064dfd473c319bbb6d825df2d167bf9ed83fd882ca510acb1c62865a9bf01f41195473d409cb1d78c02e6550a64"

RPROVIDES:${PN} += "libjcat-devel \
pkgconfig-jcat"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
jcat-tool \
libjcat1 \
pkgconfig-gio-2.0 \
pkgconfig-gnutls \
pkgconfig-json-glib-1.0"

inherit rpm
