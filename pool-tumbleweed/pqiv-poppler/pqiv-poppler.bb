SUMMARY = "Backend poppler for pqiv"
DESCRIPTION = "Backend poppler for pqiv"
LICENSE = "GPL-3.0-or-later"

PV = "2.13.3"

RPM_NAME = "pqiv-poppler-2.13.3-1.4.aarch64.rpm"
RPM_HASH = "2064a65534db343526de5775ccf7fa6f02e6b0ca5b1c61eae1b6c6ff8bfe43fdd4e1ea4f8f2bff2b0952177dc374f9c820fd2fab4f14b82f6508d9a237fa6b82"

RPROVIDES:${PN} += "pqiv-poppler"

RDEPENDS:${PN} += "libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpoppler-glib.so.8 \
pqiv"

inherit rpm
