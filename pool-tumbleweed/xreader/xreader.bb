SUMMARY = "Document viewer for documents like PDF/PostScript"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "af8bb1c6828d0430b62d24e99fb97036537a6238fe09ea6a55cbc530f109397806069a6b271548bbcdc0776964929ef149734ba1aff01c9507475b3543584d41"

RPROVIDES:${PN} += "caja-extension-xreader \
nemo-extension-xreader \
xreader \
xreader-backends"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libxapp.so.1 \
libxreaderdocument.so.3 \
libxreaderview.so.3 \
xreader-plugin-pdfdocument"

inherit rpm
