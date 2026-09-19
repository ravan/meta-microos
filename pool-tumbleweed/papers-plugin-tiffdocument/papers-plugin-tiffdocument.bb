SUMMARY = "TIFF document support for Papers"
DESCRIPTION = "A plugin for Papers to read TIFF images."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-plugin-tiffdocument-50.3-1.1.aarch64.rpm"
RPM_HASH = "03e0f04a841fd0349f52475f284c89c59f34e98e7b84871006a48d9a29315cef919e3c3c2eceddaae317f560ad47d0ed8d06ca82ab7ee892fe70111ba1e63621"

RPROVIDES:${PN} += "libtiffdocument.so \
papers-plugin-tiffdocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libppsdocument-4.0.so.6 \
libtiff.so.6 \
papers"

inherit rpm
