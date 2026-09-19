SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program with bdb support"
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-bdb-3.11.7-1.1.aarch64.rpm"
RPM_HASH = "d827f4746be96e729e0e547e7e22630015e46168c7a8dcaff1ef3d64f6fa6ceb6d2984516f1b3d2a6876b1d5647edbad911c10c41c8283d4fa206f8e688d9ac2"

RPROVIDES:${PN} += "config-postfix-bdb \
group-maildrop \
group-postfix \
libpostfix-dns.so \
libpostfix-global.so \
libpostfix-master.so \
libpostfix-tls.so \
libpostfix-util.so \
postfix-bdb \
smtp-daemon \
user-postfix"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/cmp \
/usr/bin/ed \
/usr/bin/perl \
/usr/bin/sh \
group-mail \
iproute2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libdb-4.8.so \
libicuuc.so.78 \
libpcre2-8.so.0 \
libsasl2.so.3 \
libssl.so.3 \
permissions \
sysuser-shadow \
user-nobody"

inherit rpm
