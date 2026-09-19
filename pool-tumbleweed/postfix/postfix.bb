SUMMARY = "A fast, secure, and flexible mailer"
DESCRIPTION = "Postfix aims to be an alternative to the widely-used sendmail program."
LICENSE = "EPL-2.0 | IPL-1.0"

PV = "3.11.7"

RPM_NAME = "postfix-3.11.7-1.1.aarch64.rpm"
RPM_HASH = "990d016dc665287cdc58aeb8f8b8f7d7347f375388ed2f654ba600d9b7a739d33a9b1e7d91affe43bbca3804824efa80117b7253714c41c6948298efe5162515"

RPROVIDES:${PN} += "config-postfix \
group-maildrop \
group-postfix \
libpostfix-dns.so \
libpostfix-global.so \
libpostfix-master.so \
libpostfix-tls.so \
libpostfix-util.so \
postfix \
postfix-lmdb \
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
libicuuc.so.78 \
liblmdb-0.9.35.so \
libpcre2-8.so.0 \
libsasl2.so.3 \
libssl.so.3 \
permissions \
sysuser-shadow \
user-nobody"

inherit rpm
