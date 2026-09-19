SUMMARY = "DjVu document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read DjVu documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-djvudocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "a206300b3213e8fa9a9739f9ff74cc6781d2b264d64ab869569556aed68981e7825eb6916504e8ab842d3f09c8a91abec82db4a6818c77c3ca28a46078b17e81"

RPROVIDES:${PN} += "libdjvudocument.so \
xreader-plugin-djvudocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
