SUMMARY = "Library for reading and writing gzip-compressed JSON catalog files"
DESCRIPTION = "This library allows reading and writing gzip-compressed JSON \
catalog files, which can be used to store GPG, PKCS-7 and \
SHA-256 checksums for each file. This provides  equivalent \
functionality to the catalog files supported in Microsoft Windows."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.6"

RPM_NAME = "libjcat1-0.2.6-2.1.aarch64.rpm"
RPM_HASH = "ed303c81a4c2ee8fbba3cfbec9f8e204dfa16f5c2c51bfcc10f29304f79b3fa8f47e4369081ff9e670897511ed4128b620c45fa48c36743ab6362b586f82b055"

RPROVIDES:${PN} += "libjcat.so.1 \
libjcat1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgpgme.so.45 \
libjson-glib-1.0.so.0"

inherit rpm
