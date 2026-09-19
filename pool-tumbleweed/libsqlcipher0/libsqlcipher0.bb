SUMMARY = "Shared library for SQLCipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development. \
 \
This package contains the shared library."
LICENSE = "BSD-3-Clause"

PV = "4.19.0"

RPM_NAME = "libsqlcipher0-4.19.0-1.1.aarch64.rpm"
RPM_HASH = "2a20f51584a4cba0a6009beb29dd889847f451f63ca66b3c32c60824ae549ac07eb676cccd87501d5557ec742875638611c663721371873ec93283d032813358"

RPROVIDES:${PN} += "libsqlcipher.so.0 \
libsqlcipher0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6"

inherit rpm
