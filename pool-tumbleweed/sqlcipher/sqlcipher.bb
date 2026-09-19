SUMMARY = "SQLite database encryption"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development."
LICENSE = "BSD-3-Clause"

PV = "4.19.0"

RPM_NAME = "sqlcipher-4.19.0-1.1.aarch64.rpm"
RPM_HASH = "057e74a2ef0c14340e73600e3cdb1551f22e6873039f159e53f994a9823162693ea0ad6442743a1d1c8deb011ea3df5ede5fe9cb710ce853de18a84a7fd9af56"

RPROVIDES:${PN} += "sqlcipher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libreadline.so.8 \
libz.so.1"

inherit rpm
