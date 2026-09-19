SUMMARY = "Userspace Utilities for ecryptfs"
DESCRIPTION = "A stacked cryptographic filesystem for Linux."
LICENSE = "GPL-2.0-only"

PV = "111"

RPM_NAME = "ecryptfs-utils-111-9.9.aarch64.rpm"
RPM_HASH = "a6f29db154d6079c9b64659bad1599c5a3033a3b10fc90c0cf395d3951215c950594741ce0d3a0adbb7c81bcf4cf290872d5d4078b07ad1b9321b04400e7e7cd"

RPROVIDES:${PN} += "ecryptfs-utils \
libecryptfs-key-mod-openssl.so \
libecryptfs-key-mod-passphrase.so \
libecryptfs-key-mod-pkcs11-helper.so \
libecryptfs-key-mod-tspi.so"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libecryptfs.so.1 \
libkeyutils.so.1 \
libpam.so.0 \
libpkcs11-helper.so.1 \
libtspi.so.1 \
pam-config \
permissions"

inherit rpm
