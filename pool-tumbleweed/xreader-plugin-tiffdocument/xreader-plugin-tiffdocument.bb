SUMMARY = "TIFF document support for Xreader"
DESCRIPTION = "A plugin for Xreader to read TIFF documents."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-plugin-tiffdocument-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "a9a03324ce9c7b9c82f95f168ea626d213f4d36a9242b72a2f119d3ec3be435c5ef0e4dbb1eebef9ed1dc47cc3e243feb9322aed9570364f49b7cc54ac03150b"

RPROVIDES:${PN} += "libtiffdocument.so \
xreader-plugin-tiffdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtiff.so.6 \
libxreaderdocument.so.3 \
xreader"

inherit rpm
