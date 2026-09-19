SUMMARY = "The SASL Authentication Server"
DESCRIPTION = "This daemon is required when using cyrus-sasl in server software that \
should authenticate with PAM, for example."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-saslauthd-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "f215207935f6f8b11611d954c156facfa9a3f15275ea7afcca384f30ad7a5803333506a2a208068b54c005ea84e2249edb61f19b09479ce0d1005e18cec686d9"

RPROVIDES:${PN} += "cyrus-sasl-saslauthd"

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
