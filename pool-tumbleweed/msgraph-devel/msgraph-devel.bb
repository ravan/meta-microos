SUMMARY = "Library for accessing online serive APIs using MS Graph protocol"
DESCRIPTION = "libmsgraph is a GLib-based library for accessing online serive APIs using MS Graph protocol."
LICENSE = "LGPL-3.0-or-later"

PV = "0.3.5"

RPM_NAME = "msgraph-devel-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "800a384f4701f442067c02ca5045aa3b61e39544d786b1b13a43b4485e11d30afbb814b7db6e47e5bbf4e8b1fae1ecbf91110f2ef2e0c479a8ff5b01bb0479c5"

RPROVIDES:${PN} += "msgraph-devel \
pkgconfig-msgraph-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmsgraph1-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-goa-1.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libsoup-3.0 \
typelib-1-0-Msg-1"

inherit rpm
