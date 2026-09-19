SUMMARY = "X-Apps Document Reader development files"
DESCRIPTION = "Xreader is a document viewer capable of displaying multiple and \
single page document formats like PDF and Postscript."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "4.6.5"

RPM_NAME = "xreader-devel-4.6.5-1.2.aarch64.rpm"
RPM_HASH = "6460875e37b75bc803f5fa5a8873a8be6c752b59e92dddc433baf86461dd7d76b5bb33302baa8742db93ef7e7502c64c801ed6d17dc64b4751ee8aa29c0841f0"

RPROVIDES:${PN} += "pkgconfig-xreader-document-1.5 \
pkgconfig-xreader-view-1.5 \
xreader-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-XreaderDocument-1-5 \
typelib-1-0-XreaderView-1-5"

inherit rpm
