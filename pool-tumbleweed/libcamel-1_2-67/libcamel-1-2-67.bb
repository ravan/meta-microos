SUMMARY = "Evolution Data Server's Messaging Library"
DESCRIPTION = "Evolution Data Server provides a central location for your address book \
and calendar in the GNOME Desktop. \
 \
This package contains a shared system library for messaging."
LICENSE = "LGPL-2.0-only"

PV = "3.60.2"

RPM_NAME = "libcamel-1_2-67-3.60.2-3.1.aarch64.rpm"
RPM_HASH = "66a0fb79bd6c15a3679976ff96cdbd39404891a2f1899cad1f6bb725d03f4efb760170b18d582ae550d267b06434553110315063e1ef4f1dea20326dbd579d93"

RPROVIDES:${PN} += "libcamel-1-2-67 \
libcamel-1.2.so.67"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libicuuc.so.78 \
libnspr4.so \
libnss3.so \
libsmime3.so \
libsqlite3.so.0 \
libssl3.so \
libz.so.1"

inherit rpm
