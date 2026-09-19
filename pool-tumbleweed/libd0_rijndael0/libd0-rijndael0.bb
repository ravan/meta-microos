SUMMARY = "Library for identification using RSA Blind Signatures"
DESCRIPTION = "A library for user identification using RSA blind signatures."
LICENSE = "BSD-3-Clause"

PV = "0.8.6"

RPM_NAME = "libd0_rijndael0-0.8.6-1.11.aarch64.rpm"
RPM_HASH = "37452872263dc55f479a372d109cd759ca6dd7e81542a208462031887b4d447376ca5b419db646ef1946550bfe6ee99b41827a5f9274287abeaf53f8c3acc988"

RPROVIDES:${PN} += "libd0-rijndael.so.0 \
libd0-rijndael0"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
