SUMMARY = "Provides certain programs with access to remote tape devices"
DESCRIPTION = "The rmt utility provides remote access to tape devices for programs \
like dump (a filesystem backup program), restore (a program for \
restoring files from a backup), tar (an archiving program) and cpio."
LICENSE = "BSD-3-Clause"

PV = "0.4b53"

RPM_NAME = "dump-rmt-0.4b53-2.3.aarch64.rpm"
RPM_HASH = "72fef0776a745cb3ba4d85dd571a60a147f36623bea6d60c2f16466accb08697d10d1e48fcf6ca34524f63b7aa73a489382af67f94546c93e50e9605e99d9203"

RPROVIDES:${PN} += "dump-rmt \
rmt"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
update-alternatives"

inherit rpm
