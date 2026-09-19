SUMMARY = "Implementation of the UPnP specification -- Introspection bindings"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework. \
 \
This package provides the GObject Introspection bindings for GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.10"

RPM_NAME = "typelib-1_0-GUPnP-1_0-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "930c9812fb0a1dd5be950fa753d68c496f285b9ea0a0cb39cb3ae73c5a38b5280d2f6eab8536e0be73377686a120f6545043dde0713063135eeb0fd79854329d"

RPROVIDES:${PN} += "typelib-1-0-GUPnP-1-0 \
typelib-GUPnP"

RDEPENDS:${PN} += "libgupnp-1.6.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-GSSDP \
typelib-Gio \
typelib-Soup \
typelib-libxml2"

inherit rpm
