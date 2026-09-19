SUMMARY = "PDF to SVG Converter"
DESCRIPTION = "A small tool to convert PDF files into SVG using poppler and cairo."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.4"

RPM_NAME = "pdf2svg-0.2.4-1.3.aarch64.rpm"
RPM_HASH = "0ad08d0ef563d262704b53b3ee38a5b72664c472b801670e7c3bfa837bd8d817651b6dc7a2d53f35faf7273d03b7a99a0d14e34542145d8e1cb6dc10a128fb65"

RPROVIDES:${PN} += "pdf2svg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpoppler-glib.so.8"

inherit rpm
