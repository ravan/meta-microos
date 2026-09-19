SUMMARY = "Collection of helpers for building DLNA applications - Introspection bindings"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package provides the GObject Introspection bindings for GUPnP-DLNA."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "typelib-1_0-GUPnPDLNA-2_0-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "c757ed94d6f4bcf52821caf5a94f6d2d670a0d774e2b8060ba9ed4ba78e61ff5e023aab40d9af066705f27c4b8f9f084aecfab18fcc5a4ecd3fa174233fa5129"

RPROVIDES:${PN} += "typelib-1-0-GUPnPDLNA-2-0 \
typelib-GUPnPDLNA"

RDEPENDS:${PN} += "libgupnp-dlna-2.0.so.4 \
typelib-GLib \
typelib-GObject"

inherit rpm
