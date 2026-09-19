SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-bdb-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "6185c7f83e60017076e59035fd99983e06f6241b253592e30b441da6c4fc4e7c807e76319ab2437fe8a42795896340a5679ad8765d6d8a67692500c84a0f91ba"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd-bdb"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libcrypto.so.3 \
libkrb5.so.3 \
liblber.so.2 \
libldap.so.2 \
libpam.so.0 \
systemd"

inherit rpm
