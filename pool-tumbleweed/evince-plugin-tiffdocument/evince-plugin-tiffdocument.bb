SUMMARY = "TIFF document support for Evince"
DESCRIPTION = "A plugin for Evince to read TIFF images."
LICENSE = "GPL-2.0-or-later"

PV = "48.4"

RPM_NAME = "evince-plugin-tiffdocument-48.4-2.1.aarch64.rpm"
RPM_HASH = "51f7eefc4f40b992f3ba73fdbe17e914dcf6a63617e884453e8f3f351e1a56b60689d13c7b43e23c209c66a8cbab7c234a4fc20027b676c94d2c99bba9dc9bb1"

RPROVIDES:${PN} += "evince-plugin-tiffdocument \
libtiffdocument.so"

RDEPENDS:${PN} += "evince \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libevdocument3.so.4 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libtiff.so.6"

inherit rpm
