SUMMARY = "Extended crypt library for DES, MD5, Blowfish and others"
DESCRIPTION = "libxcrypt is a modern library for one-way hashing of passwords.  It \
supports DES, MD5, SHA-2-256, SHA-2-512, and bcrypt-based password \
hashes, and provides the traditional Unix 'crypt' and 'crypt_r' \
interfaces, as well as a set of extended interfaces pioneered by \
Openwall Linux, 'crypt_rn', 'crypt_ra', 'crypt_gensalt', \
'crypt_gensalt_rn', and 'crypt_gensalt_ra'."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later & BSD-3-Clause & SUSE-Public-Domain"

PV = "4.5.2"

RPM_NAME = "libcrypt1-4.5.2-2.4.aarch64.rpm"
RPM_HASH = "2fd0159190d1c7dcb3da6af103d8a09c8a97bb0564d3292c6403f1118491a2f35f4061c961cfd522c7e25346292d8b94e63a4696a73e9994119ddbb1527758bb"

RPROVIDES:${PN} += "libcrypt.so.1 \
libcrypt1 \
libowcrypt.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
