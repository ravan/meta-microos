SUMMARY = "Library files for gxml"
DESCRIPTION = "Library files for gxml."
LICENSE = "LGPL-2.1-or-later"

PV = "0.20.4"

RPM_NAME = "libgxml-0_20-2_0_2-0.20.4-2.7.aarch64.rpm"
RPM_HASH = "013b7aa6b4a5c4faeab0f2c62845eb0bd4d933d08d6ac2857bb8b411c5c6dbb220b27b277c6910bae057207f6ea2bbf02f2ab5bc1b267d99873bcb88a905ea7f"

RPROVIDES:${PN} += "libgxml-0-20-2-0-2 \
libgxml-0.20.so.2.0.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16"

inherit rpm
