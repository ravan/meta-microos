SUMMARY = "SQLite3 VFS for Ceph"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "libcephsqlite-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "392c92c786b09b4c8fc41738c535296b05d426222e021d86adb04cfccd4333a2e676afd297a9217acf2bc808f94804128db26830b1dbc344118683828397108f"

RPROVIDES:${PN} += "libcephsqlite \
libcephsqlite.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libceph-common.so.2 \
libgcc-s.so.1 \
librados.so.2 \
librados2 \
libstdc++.so.6"

inherit rpm
