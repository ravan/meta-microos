SUMMARY = "A Cairo-based canvas widget for GTK+"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. It has an optional model/view split, and uses interfaces \
for items and models, so any application object can be turned into a \
canvas item or model."
LICENSE = "LGPL-2.0-only"

PV = "2.0.4"

RPM_NAME = "libgoocanvas-2_0-9-2.0.4-5.6.aarch64.rpm"
RPM_HASH = "a4fed2865fac690efae1985bc93d097ed9276be4ed04b295f0605dc586d22fc2c36b46891828af9e52f663a1a70be225d96fcf0831e9244d0c7c242b1b7a5f51"

RPROVIDES:${PN} += "goocanvas2 \
libgoocanvas-2-0-9 \
libgoocanvas-2.0.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
