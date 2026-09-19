SUMMARY = "Implementation of the UPnP specification"
DESCRIPTION = "	GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.10"

RPM_NAME = "libgupnp-1_6-0-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "348165f0ea4eaaf60db599443355cf0f76519071fa16b890e5588d535a7219d5fd0fba8ff472f03195086a778f88c1711b5ac4a28815c3ed10d01bd5d2284e7e"

RPROVIDES:${PN} += "libgupnp-1-6-0 \
libgupnp-1.6.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
