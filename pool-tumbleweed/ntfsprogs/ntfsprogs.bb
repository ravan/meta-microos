SUMMARY = "NTFS Utilities"
DESCRIPTION = "The ntfsprogs includes utilities for doing all required tasks to NTFS \
partitions. In general, just run a utility without any command line \
options to display the version number and usage syntax."
LICENSE = "GPL-2.0-or-later"

PV = "2026.7.7"

RPM_NAME = "ntfsprogs-2026.7.7-1.1.aarch64.rpm"
RPM_HASH = "2ebf7a1b5474676243b7f05c7ade6b7a29adf6f5687821d9cca095a66e1da346459209b7ece646a23b17d0a3813024abf83f0b840a3c200c2f6d34ca02f8cb4e"

RPROVIDES:${PN} += "ntfsprogs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcrypt.so.20 \
libgnutls.so.30 \
libntfs-3g.so.90 \
libuuid.so.1"

inherit rpm
