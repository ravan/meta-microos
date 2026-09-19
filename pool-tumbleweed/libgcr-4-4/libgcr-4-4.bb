SUMMARY = "Library for Crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "libgcr-4-4-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "9201f9461166f73efa93ed92c7c370ba4da75c10bed655de71d362398b34579b67813a620a40f7f4ac9a9f4b45512c4445d5e465853411844840b41eda9d6572"

RPROVIDES:${PN} += "gcr \
libgcr-4-4 \
libgcr-4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-2.so.2 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libp11-kit.so.0"

inherit rpm
