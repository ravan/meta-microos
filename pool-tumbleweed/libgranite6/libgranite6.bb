SUMMARY = "Granite is a development library"
DESCRIPTION = "This package provides the library files for granite6"
LICENSE = "LGPL-3.0-or-later"

PV = "6.2.0"

RPM_NAME = "libgranite6-6.2.0-2.8.aarch64.rpm"
RPM_HASH = "ec76ed716c488bc0c47d279df743239ed01fdca7e1b20325450efe97c04575b3b36ea0053f4f7c77b07ab77508260d2502cd38fc86e08ed8d02fff115beeaa00"

RPROVIDES:${PN} += "granite \
granite6 \
libgranite.so.6 \
libgranite6"

RDEPENDS:${PN} += "/sbin/ldconfig \
granite6-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm
