SUMMARY = "Implementation of the UPnP specification - Development Files"
DESCRIPTION = "GUPnP implements the UPnP specification: resource announcement and \
discovery, description, control, event notification, and presentation \
(GUPnP includes basic web server functionality through libsoup). GUPnP \
does not include helpers for construction or control of specific \
standardized resources (e.g. MediaServer); this is left for higher level \
libraries utilizing the GUPnP framework."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.10"

RPM_NAME = "libgupnp-devel-1.6.10-1.3.aarch64.rpm"
RPM_HASH = "df267cbcbdc98d0beb72e06251140e8e3ee2356af6ea7f2a00ba1bcfa11ca05e791ae643d6d7e09f1e7314ea01acd1cc3c1c9c416f03d4534239cc8951ffdf3c"

RPROVIDES:${PN} += "libgupnp-devel \
pkgconfig-gupnp-1.6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.13 \
libgupnp-1-6-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gssdp-1.6 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GUPnP-1-0"

inherit rpm
