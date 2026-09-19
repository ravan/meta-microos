SUMMARY = "DjVu document support for Papers"
DESCRIPTION = "A plugin for Papers to read DjVu documents."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "papers-plugin-djvudocument-50.3-1.1.aarch64.rpm"
RPM_HASH = "e5865523e80f953c9bb00c2c897fa573860ed5e1a52b6bf20bd6181c718da6880d4d9d8743852197acddd728a9f4d43d310fc279fb698c389fad81ab3efe702b"

RPROVIDES:${PN} += "libdjvudocument.so \
papers-plugin-djvudocument"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdjvulibre.so.21 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libppsdocument-4.0.so.6 \
papers"

inherit rpm
