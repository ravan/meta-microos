SUMMARY = "GUPnP-DLNA GStreamer meta-extraction backend"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP. \
 \
This package contains the meta-data extraction based on GStreamer"
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-backend-gstreamer-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "6e68139f3227cb64001a4bc9a14e1b398ac76f6f5b26f4f847912e02578943fcd4e3afde04fe8e937675cea0d74b5da67ccfbb0dba5a49845d85abba637d8cd6"

RPROVIDES:${PN} += "libgstreamer.so \
libgupnp-dlna-backend \
libgupnp-dlna-backend-gstreamer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgupnp-dlna-gst-2.0.so.4"

inherit rpm
