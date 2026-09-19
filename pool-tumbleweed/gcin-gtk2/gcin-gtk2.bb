SUMMARY = "Gcin gtk2 immodule"
DESCRIPTION = "gcin gtk2 immodule, support gtk2-based applications"
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-gtk2-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "e49fa5cdbcff3564b61d96f3acc04a0214e3ae6655423fec9065df2198923001298e30fe00b121d2f8014368c850323cd279dd5e77b94524c4b4bf8e82b56577"

RPROVIDES:${PN} += "gcin-gtk2 \
gcin-gtk2-immodule"

RDEPENDS:${PN} += "/usr/bin/sh \
gcin \
gtk2-tools \
libc.so.6 \
libgcin-im-client.so.1 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libpango-1.0.so.0"

inherit rpm
