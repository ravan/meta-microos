SUMMARY = "Clustered TDB"
DESCRIPTION = "ctdb is the clustered database used by Samba"
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "ctdb-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "f82cdc4124f5de15178ffdc27f3b8cfa7c4fce6b063f704bc47a7f31b52272ce87e84127a1bf93601bfec72abf152a76d0e25e2be85666f6bf95536930e2b4dc"

RPROVIDES:${PN} += "config-ctdb \
ctdb \
ctdb-tests \
libctdb-event-client-private-samba.so"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/killall \
/usr/bin/mkdir \
/usr/bin/mktemp \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
coreutils \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgenrand-private-samba.so \
libpopt.so.0 \
libreplace-private-samba.so \
libsamba-debug-private-samba.so \
libsamba-util.so.0 \
libsocket-blocking-private-samba.so \
libsys-rw-private-samba.so \
libtalloc-report-private-samba.so \
libtalloc.so.2 \
libtdb-wrap-private-samba.so \
libtdb.so.1 \
libtevent-util.so.0 \
libtevent.so.0 \
libtime-basic-private-samba.so \
tdb-tools"

inherit rpm
