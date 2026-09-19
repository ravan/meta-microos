SUMMARY = "A collection of helpers for building DLNA applications"
DESCRIPTION = "GUPnP-DLNA is a collection of helpers for building DLNA media sharing \
applications using GUPnP."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.0"

RPM_NAME = "libgupnp-dlna-2_0-4-0.12.0-1.22.aarch64.rpm"
RPM_HASH = "01b26b576369e80c680c185aa01cb40d25bbc7cf3ea3db1a4f5da058beb35dccc39d698de3314fd0f1d3efe226d5a6d96fc67f74169fd34786804b4d66e739bb"

RPROVIDES:${PN} += "libgupnp-dlna-2-0-4 \
libgupnp-dlna-2.0.so.4 \
libgupnp-dlna-gst-2.0.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
gupnp-dlna \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgupnp-dlna-backend \
libxml2.so.16"

inherit rpm
