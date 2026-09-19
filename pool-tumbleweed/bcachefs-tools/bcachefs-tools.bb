SUMMARY = "Configuration utilities for bcachefs"
DESCRIPTION = "Bcachefs is a filesystem for Linux, with an emphasis on reliability \
and robustness. \
 \
* Copy on write (COW) like zfs or btrfs \
* Full data and metadata checksumming \
* Multiple devices \
* Replication \
* Erasure coding \
* Caching \
* Compression \
* Encryption \
* Snapshots \
 \
This package contains utilities for creating and mounting bcachefs."
LICENSE = "Apache-2.0 & (Apache-2.0 | MIT) & (Apache-2.0 | Apache-2.0-with-LLVM-exception | MIT) & MIT & MPL-2.0 & (MIT | Unlicense) & BSD-3-Clause & GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-only"

PV = "1.39.6"

RPM_NAME = "bcachefs-tools-1.39.6-1.1.aarch64.rpm"
RPM_HASH = "e00f08dda09068cc826fbee63f6544a75f7a7d0194246c3b140f4174a4afe16b5b3d79e7d5dc307216b258f627dce79fa4def5596a5efdaacbf708f648419a0c"

RPROVIDES:${PN} += "bcachefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaio.so.1 \
libblkid.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libkeyutils.so.1 \
liblz4.so.1 \
libsodium.so.26 \
libudev.so.1 \
libunwind.so.8 \
liburcu.so.8 \
libuuid.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
