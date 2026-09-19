SUMMARY = "Atril shared libraries (View and Document)"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and single \
page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "atril-backends-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "cb3480fadd7518756504b45069bfb786c8c3a0ee0faf92d072d99e9ed1be2a94fdc74e5d97b37f27fd8d3483a7d05f3777f782b2f6d56ccaa66218af028345cc"

RPROVIDES:${PN} += "atril-backends \
libcomicsdocument.so \
libdjvudocument.so \
libdvidocument.so \
libepubdocument.so \
libpdfdocument.so \
libpsdocument.so \
libtiffdocument.so \
libxpsdocument.so \
mate-document-viewer-libs-3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libatrildocument.so.3 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgxps.so.2 \
libkpathsea.so.6 \
libm.so.6 \
libpango-1.0.so.0 \
libpoppler-glib.so.8 \
libspectre.so.1 \
libtiff.so.6 \
libxml2.so.16 \
libz.so.1 \
mathjax"

inherit rpm
