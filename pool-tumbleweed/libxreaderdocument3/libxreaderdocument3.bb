SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "libxreaderdocument3-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "49307be874b190d8e609a8ab4f528bde4a382e09e5499e5eb3b7bfa75feaa76daa972d46758a83390b7a3c067c79eb924788d7d7a45e180743d4b6ac387d1644"

RPROVIDES:${PN} += "libxreaderdocument.so.3 \
libxreaderdocument3"

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
libz.so.1"

inherit rpm
