SUMMARY = "Development files for SQLCipher"
DESCRIPTION = "SQLCipher is an SQLite extension that provides transparent 256-bit AES \
encryption of database files. Pages are encrypted before being written to \
disk and are decrypted when read back. Due to the small footprint and great \
performance it’s ideal for protecting embedded application databases and is \
well suited for mobile development. \
 \
This package contains development files for SQLCipher."
LICENSE = "BSD-3-Clause"

PV = "4.19.0"

RPM_NAME = "sqlcipher-devel-4.19.0-1.1.aarch64.rpm"
RPM_HASH = "bbe3152c143b5daa0560eaaa7fc2dff6cad2ce9fd98e05b9f917f3f20c01846ee1d59aa45788b17b77767def8173de795f655be4abd0a4be7fb634463c196dfa"

RPROVIDES:${PN} += "pkgconfig-sqlcipher \
sqlcipher-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsqlcipher0 \
sqlcipher"

inherit rpm
