SUMMARY = "Lightweight SMTP Client"
DESCRIPTION = "msmtp is an SMTP client that can be used as a plug-in for Mutt and \
other mail user agents.  It forwards mail to an SMTP server that does \
the delivery.  msmtp supports multiple accounts."
LICENSE = "GPL-3.0-or-later"

PV = "1.8.34"

RPM_NAME = "msmtp-1.8.34-1.1.aarch64.rpm"
RPM_HASH = "42f5c83a56d7537968c147e7ddf519f60ee5a49130c9c4b59da7414e38bd6618534102f53a6848aafc1c0c614167d0b7a9ae010a2206bb3bd852e931d8c99d61"

RPROVIDES:${PN} += "msmtp"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgsasl.so.18 \
libidn2.so.0 \
libresolv.so.2 \
libsecret-1.so.0"

inherit rpm
