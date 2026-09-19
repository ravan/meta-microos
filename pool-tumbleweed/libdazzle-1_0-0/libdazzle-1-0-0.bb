SUMMARY = "Collection of fancy features for GLib and Gtk+ -- Library file"
DESCRIPTION = "This library is a companion library to GObject and Gtk+. \
It provides various features that are wished in the underlying \
library but are not for various reasons. In most cases, they are \
wildly out of scope for those libraries. In other cases, the design \
isn't quite generic enough to work for everyone. \
 \
This package provides the libdazzle shared library."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "3.44.0"

RPM_NAME = "libdazzle-1_0-0-3.44.0-2.7.aarch64.rpm"
RPM_HASH = "36fd7cf4af23bdfef47261678bc3d9bb6215907dc0c8a5679390049c7ef5f4f3ac40448c5acf8951baa1c59a889e3f461f539128500bbacaec20a9d8a4fd03f9"

RPROVIDES:${PN} += "libdazzle \
libdazzle-1-0-0 \
libdazzle-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0"

inherit rpm
