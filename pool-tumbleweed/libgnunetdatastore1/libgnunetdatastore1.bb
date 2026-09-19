SUMMARY = "GNUnet library libgnunetdatastore"
DESCRIPTION = "This package contains the libgnunetdatastore library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetdatastore1-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "65677ff4b1f82c9f27576dbb7a1af51cba82b2819adbe3b6053f45146cdb1b1354706bd2fad35665ef63d6d28109864655cdbab049a0e584ed425f2b89e7242f"

RPROVIDES:${PN} += "libgnunetdatastore.so.1 \
libgnunetdatastore1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetstatistics.so.2 \
libgnunetutil.so.20"

inherit rpm
