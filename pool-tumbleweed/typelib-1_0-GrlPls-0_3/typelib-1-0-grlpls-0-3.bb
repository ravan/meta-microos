SUMMARY = "Introspection bindings for grilo"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API. \
 \
This package provides the GObject Introspection bindings for the \
libgrlnet library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.19"

RPM_NAME = "typelib-1_0-GrlPls-0_3-0.3.19-2.5.aarch64.rpm"
RPM_HASH = "ad11440d5ed9fc35c3632cfc2eea80d86cd33bb888a76321c61ef4d37e132f0a670d57d163bcbf1e2b1016b209730966aeb67580e9bd7478ca2081e7b9c21cf9"

RPROVIDES:${PN} += "typelib-1-0-GrlPls-0-3 \
typelib-GrlPls"

RDEPENDS:${PN} += "libgrlpls-0.3.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Grl"

inherit rpm
