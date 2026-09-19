SUMMARY = "A collection of helpers for building DLNA applications - Development Files"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-devel-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "068122a57913dec3273d80487f8f536da2b58a19385ce30e3591c9fd9c4d6d54a68b936ff6465731e93cc1861e08812de5fb38e499208fa83f13c9a02ddfc323"

RPROVIDES:${PN} += "libgupnp-dlna-devel \
pkgconfig-gupnp-dlna-2.0 \
pkgconfig-gupnp-dlna-gst-2.0 \
pkgconfig-gupnp-dlna-metadata-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgupnp-dlna-2-0-4 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gupnp-dlna-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GUPnPDLNA-2-0 \
typelib-1-0-GUPnPDLNAGst-2-0"

inherit rpm
