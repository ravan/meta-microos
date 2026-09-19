SUMMARY = "Apache Portable Runtime (APR) Utility Library"
DESCRIPTION = "A companion library to APR, the Apache Portable Runtime."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "libapr-util1-0-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "6b6df8b49b36c43b308fbf9c5f5ec1fa9e2a1784eee3cfff681e4f0bb2ed88aa861e7f6e75a3bca5de1d8c868fa8716c484683c3ab92ff536aed97c72551b2dd"

RPROVIDES:${PN} += "libapr-util1-0 \
libaprutil-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libapr1-0 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libexpat.so.1 \
libgdbm.so.6 \
libldap.so.2"

inherit rpm
