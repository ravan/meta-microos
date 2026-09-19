SUMMARY = "Library to handle UPnP IGD port mapping -- Introspection bindings"
DESCRIPTION = "GUPnP-IGD is a library to handle UPnP IGD port mapping. It is supposed \
to have a very simple API. \
 \
This package provides the GObject Introspection bindings for GUPnP-IGD."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "typelib-1_0-GUPnPIgd-1_6-1.6.0-2.13.aarch64.rpm"
RPM_HASH = "ddbf5ebfb4f12a051377111dd75b0c88593392d1f42911a069493edc066b0b8acd2129b1e2b47824cf837ac4cdfdc0cbf1fd38796bd9e67dcca72c0c8e076bf1"

RPROVIDES:${PN} += "typelib-1-0-GUPnPIgd-1-6 \
typelib-GUPnPIgd"

RDEPENDS:${PN} += "libgupnp-igd-1.6.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
