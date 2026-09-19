SUMMARY = "Development files for the GObject-based oVirt bindings"
DESCRIPTION = "GoVirt is a GObject wrapper for the oVirt REST API [1]. It will \
only provide very basic functionality as the goal is to \
autogenerate a full wrapper as it is already done for the python \
bindings."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.11"

RPM_NAME = "libgovirt-devel-0.3.11-1.3.aarch64.rpm"
RPM_HASH = "ed392fd7957256ed25f060ef334e250ce9a63f3bdcbe9ba986b4517eac2f62767c6fe6eb31d70edc3602f0647f9dbc3b15a6be97f3ac136dd3f351bebc3af196"

RPROVIDES:${PN} += "libgovirt-devel \
pkgconfig-govirt-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgovirt2 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-rest-1.0 \
typelib-1-0-GoVirt-1-0"

inherit rpm
