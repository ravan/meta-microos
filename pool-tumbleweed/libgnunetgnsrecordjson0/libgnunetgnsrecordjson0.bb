SUMMARY = "GNUnet library libgnunetgnsrecordjson"
DESCRIPTION = "This package contains the libgnunetgnsrecordjson library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetgnsrecordjson0-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "2f86e0f1bc0c0ebb157e03f57a84a8f799c989d959276189ea5053519633edb05b6dc8f6e2dee6d561813391895562c21ca01f8c6f80ec983199894b055706d7"

RPROVIDES:${PN} += "libgnunetgnsrecordjson.so.0 \
libgnunetgnsrecordjson0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetgnsrecord.so.0 \
libgnunetutil.so.20 \
libjansson.so.4"

inherit rpm
