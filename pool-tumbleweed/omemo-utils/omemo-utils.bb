SUMMARY = "Utilities for OMEMO media sharing"
DESCRIPTION = "Utilities for OMEMO media sharing."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "omemo-utils-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "c0bbb23e74f3321adbc8c8a4e5f7b00618938c2cc03779b8adfcad98bc216039cf8084b1f2f0f600fd7620e622ea31527338906decbbf6c4c8e7fd385aea11ec"

RPROVIDES:${PN} += "omemo-utils"

RDEPENDS:${PN} += "libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20"

inherit rpm
