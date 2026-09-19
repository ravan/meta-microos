SUMMARY = "Library to display maps"
DESCRIPTION = "Libchamplain is a C library providing a ClutterActor to display maps. It \
also provides a Gtk+ widget to display maps in Gtk+ applications. \
 \
It supports numerous free map sources such as OpenStreetMap, \
OpenAerialMap and Maps for free."
LICENSE = "LGPL-2.1-or-later"

PV = "0.12.21"

RPM_NAME = "libchamplain-0_12-0-0.12.21-1.17.aarch64.rpm"
RPM_HASH = "62864834d0f4c95b06210e282bb5eb2e995c50abb21df4cec7cdc9a4aaa598fb3693792f650359440cb54337f90bffa164f712c022379e20ceeb0c47982e6b47"

RPROVIDES:${PN} += "libchamplain-0-12-0 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcogl-path.so.20 \
libcogl.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0"

inherit rpm
