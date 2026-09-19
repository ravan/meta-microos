SUMMARY = "RADOS gateway client library"
DESCRIPTION = "This package provides a library implementation of the RADOS gateway \
(distributed object store with S3 and Swift personalities)."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "librgw2-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "bd40f2b89306298d3e3b346d82dffd090838f7f61818d66e55d5af56e67d0e26a2b78cd305899b969f7826bbcc13c978fe6873e7cc26129a8dacee62998c0444"

RPROVIDES:${PN} += "librgw-op-tp.so.2 \
librgw-rados-tp.so.2 \
librgw.so.2 \
librgw2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libcrypto.so.3 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libicuuc.so.78 \
libldap.so.2 \
liblttng-ust.so.1 \
liblua5.4.so.5 \
libm.so.6 \
librados.so.2 \
librados2 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
