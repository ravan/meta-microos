SUMMARY = "GNUnet library libgnunetjson"
DESCRIPTION = "This package contains the libgnunetjson library for GNUnet."
LICENSE = "AGPL-3.0-or-later"

PV = "0.26.2"

RPM_NAME = "libgnunetjson3-0.26.2-1.4.aarch64.rpm"
RPM_HASH = "314b2e026a56e33f8339e3da55854da540305aac78cdc3019c365d6dd93110afd46e37c9bafe2f470ae2caf797c6a912917e9eb5737064c8e0048680f52baa6c"

RPROVIDES:${PN} += "libgnunetjson.so.3 \
libgnunetjson3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnunetutil.so.20 \
libjansson.so.4"

inherit rpm
