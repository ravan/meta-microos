SUMMARY = "Library to read and write vcard files"
DESCRIPTION = "Library to read and write vcard files."
LICENSE = "LGPL-2.1-only"

PV = "013"

RPM_NAME = "libvc0-013-1.3.aarch64.rpm"
RPM_HASH = "4fa1165c13d5c4b488de883b1dbe115dc5e3571d0447a9ec00427dfd9d49d0c80e2aa54e8381d19aae6358d7e246f34976402a4c111d84d8a5ce9fce6140061c"

RPROVIDES:${PN} += "libvc.so.0 \
libvc0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
