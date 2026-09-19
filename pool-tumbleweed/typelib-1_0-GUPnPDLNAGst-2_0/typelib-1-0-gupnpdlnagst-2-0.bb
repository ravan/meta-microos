SUMMARY = "Collection of helpers for building DLNA applications - Introspection bindings"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package provides the GObject Introspection bindings for GUPnP-DLNA."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "typelib-1_0-GUPnPDLNAGst-2_0-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "d6d3016a41eb5edd840d71243cac82d9068eb9385c34082ba8bd3cabbf5d2a55886e17834be3f7fae6ad4228864441ff009be6790a4ebe5a5b53ca3d0a1352c9"

RPROVIDES:${PN} += "typelib-1-0-GUPnPDLNAGst-2-0 \
typelib-GUPnPDLNAGst"

RDEPENDS:${PN} += "libgupnp-dlna-gst-2.0.so.4 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GUPnPDLNA \
typelib-Gst \
typelib-GstAudio \
typelib-GstBase \
typelib-GstPbutils \
typelib-GstVideo"

inherit rpm
