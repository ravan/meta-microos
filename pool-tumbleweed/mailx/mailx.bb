SUMMARY = "A MIME-Capable Implementation of the mailx Command"
DESCRIPTION = "Nail is a mail user agent derived from Berkeley Mail 8.1.  It is \
intended to provide the functionality of the POSIX.2 mailx command with \
additional support for MIME messages, POP3, and SMTP.  In recent system \
environments, nail is Unicode/UTF-8 capable.  Further, it contains some \
minor enhancements like the ability to set a 'From:' address."
LICENSE = "BSD-4-Clause & MPL-1.1"

PV = "12.5"

RPM_NAME = "mailx-12.5-39.5.aarch64.rpm"
RPM_HASH = "572ac6459bb3b063d6b2eda0ded80c6fa5f71e5de90105abf32d0e24a76bdbe5e13b6dc41073eadf9f8bcab9ed0ed75e36e5cdd2498c0a760c47f5352e4b8499"

RPROVIDES:${PN} += "mail \
mailx"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libssl.so.3"

inherit rpm
