SUMMARY = "GNUnet library libgnunettransportcore"
DESCRIPTION = "This package contains the libgnunettransportcore library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunettransportcore0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "bcc723c5a2422d9cd78965b82505da5f6def7cdd72e4363e3a6c0f7ca0d29d4d832ad17239039ccf58c8e42e8844ebcd60de12ecdbafe5fcb8f9c3405e684c83"

RPROVIDES:${PN} += "libgnunettransportcore.so.0 \
libgnunettransportcore0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20"

inherit rpm
