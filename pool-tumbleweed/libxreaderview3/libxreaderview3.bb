SUMMARY = "X-Apps Document Reader -- System Library"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "libxreaderview3-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "a3ba424c1515a9c5ead331690ac014f49ea576dd02a097d1df288aeaf2908c2bcfa596e036b1c2784bf4a7a892315734b7befe2bea22da4fd4dcd824a7512350"

RPROVIDES:${PN} += "libxreaderview.so.3 \
libxreaderview3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libxreaderdocument.so.3"

inherit rpm
