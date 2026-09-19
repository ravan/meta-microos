SUMMARY = "GTK+ widget for fast data display"
DESCRIPTION = "GtkDatabox is a widget for the Gtk+-3 library designed to display large \
amounts of numerical data fast and easy."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "libgtkdatabox1-1.0.0-1.21.aarch64.rpm"
RPM_HASH = "a91992cb7493793b083489f3ad57e880d4c560cdf5f60fc5848734e69bd635c8109ad793c7731c5fef89b726c46d536f59439a24a0f29eb8b68919cab1e2c2d7"

RPROVIDES:${PN} += "libgtkdatabox.so.1 \
libgtkdatabox1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
