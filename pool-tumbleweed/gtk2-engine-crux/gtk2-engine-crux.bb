SUMMARY = "Crux GTK+ 2 Theme Engine"
DESCRIPTION = "The Crux engine was a popular theme in the early GNOME 2 days."
LICENSE = "LGPL-2.1-or-later"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-crux-2.20.2-23.6.aarch64.rpm"
RPM_HASH = "616a27f688aed0ae76c823f0af8544910377b54a2b35bc6b81e3fadd8e62146dff02abe6cb56a69437c18225c3b1690da3299b669819d510646297a0b081f0b9"

RPROVIDES:${PN} += "gtk2-engine-crux \
libcrux-engine.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
