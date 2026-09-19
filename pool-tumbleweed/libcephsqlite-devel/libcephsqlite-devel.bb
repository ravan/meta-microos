SUMMARY = "SQLite3 VFS for Ceph headers"
DESCRIPTION = "A SQLite3 VFS for storing and manipulating databases stored on Ceph's RADOS \
distributed object store."
LICENSE = "BSD-3-Clause & BSL-1.0 & CC-BY-SA-3.0 & LGPL-2.1-only & LGPL-3.0-only & GPL-2.0-only & MIT"

PV = "18.2.7"

RPM_NAME = "libcephsqlite-devel-18.2.7-8.1.aarch64.rpm"
RPM_HASH = "ecabd0e4bf2289740e09434ae548d2ba23c87ef83f05f903626415ed525161990e310f224eb4c35109d606372a7a95e10e2e34d7bec9ea5d9f8a00b4f7dd59f3"

RPROVIDES:${PN} += "libcephsqlite-devel"

RDEPENDS:${PN} += "libcephsqlite \
librados-devel \
libradospp-devel \
sqlite-devel"

inherit rpm
