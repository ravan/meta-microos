SUMMARY = "File encryption, decryption, signature creation and verification utility"
DESCRIPTION = "GnuPG is a hybrid-encryption software program; it uses a combination \
of symmetric-key and public-key cryptography to encrypt/decrypt \
messages and/or to sign and verify them. \
 \
gpg2 provides GPGSM, gpg-agent, and a keybox library."
LICENSE = "GPL-3.0-or-later"

PV = "2.5.22"

RPM_NAME = "gpg2-2.5.22-1.1.aarch64.rpm"
RPM_HASH = "b0326276cedd8248e52b8fcdeb7f33dd54b18ec54517d793ab0efd49965d9f40b3e6e05ae5afa66cb80fa5d4d4352020db2ff78fcc039991af7d337b0b7199fc"

RPROVIDES:${PN} += "config-gpg2 \
gnupg \
gpg \
gpg2 \
newpg"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libassuan.so.9 \
libbz2.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgpg-error.so.0 \
libksba.so.8 \
libnpth.so.0 \
libreadline.so.8 \
libsqlite3.so.0 \
libusb-1.0.so.0 \
libz.so.1 \
pinentry"

inherit rpm
