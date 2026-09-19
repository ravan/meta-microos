SUMMARY = "System library of the MATE Document Viewer"
DESCRIPTION = "Atril is a document viewer capable of displaying multiple and \
singlepage document formats like PDF and PostScript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.28.4"

RPM_NAME = "libatrildocument3-1.28.4-1.2.aarch64.rpm"
RPM_HASH = "24f7b9021133f594365a08a1cb03990cebf13b9b7be0dc80acaef88c101d5cb4848ca7c9c080435be32822ed9fd6d7a72c64502a406020c88a1bcc72e0785a03"

RPROVIDES:${PN} += "libatrildocument.so.3 \
libatrildocument3"

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
libm.so.6 \
libsynctex.so.2"

inherit rpm
