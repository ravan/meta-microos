SUMMARY = "Import and Export of Autodesk 3DS Files"
DESCRIPTION = "Lib3ds is a free alternative to Autodesk's 3DS File Toolkit for \
handling 3DS files. Its main goal is to simplify the creation of 3DS \
import and export filters."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lib3ds-1-3-1.3.0-31.19.aarch64.rpm"
RPM_HASH = "82de79e8220dd25c820444d1052e3f21692b97f42c7a94e38ef1ef1c337b574aa102176492bac866390f4ca48f4f92036bde7f92d9b1326e7ebc22c1b8c354c8"

RPROVIDES:${PN} += "lib3ds \
lib3ds-1-3 \
lib3ds-1.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
