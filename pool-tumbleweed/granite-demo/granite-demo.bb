SUMMARY = "Demo binaries for the Granite development library"
DESCRIPTION = "This package contains a small demo application to show the granite widgets."
LICENSE = "LGPL-3.0-or-later"

PV = "7.8.1"

RPM_NAME = "granite-demo-7.8.1-1.3.aarch64.rpm"
RPM_HASH = "4ae0bca91e20a051679f03ea14ff7daf1176321cfb4ecfd828861db2778ab957e1d7e1b13df410ec8ed030c27d0ab4b0fb8773c9b31a34ef9c34acd758188125"

RPROVIDES:${PN} += "granite-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgtk-4.so.1 \
libshumate-1.0.so.1"

inherit rpm
