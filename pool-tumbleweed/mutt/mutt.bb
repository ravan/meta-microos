SUMMARY = "Mail Program"
DESCRIPTION = "A very powerful mail user agent. It supports (among other nice things) \
highlighting, threading, and PGP. It takes some time to get used to, \
however. This version is based on NeoMutt, that is it includes many \
enhancements."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "mutt-2.4.2-1.1.aarch64.rpm"
RPM_HASH = "7ac200792e81990befdf226a4da1ca4a6cb33a959d1300874f287669018ff69110b2362c5a75694fe17124c77560bb209a3ad9569bd1377d0d6a6de987ba9205"

RPROVIDES:${PN} += "config-mutt \
mutt"

RDEPENDS:${PN} += "/usr/bin/cat \
/usr/bin/grep \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/rm \
/usr/bin/sh \
/usr/bin/zcat \
cyrus-sasl-gssapi \
cyrus-sasl-plain \
glibc-locale \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libgpg-error.so.0 \
libgpgme.so.45 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libkyotocabinet.so.16 \
libncursesw.so.6 \
libsasl2.so.3 \
libsqlite3.so.0 \
libtinfo.so.6 \
libz.so.1 \
shared-mime-info"

inherit rpm
