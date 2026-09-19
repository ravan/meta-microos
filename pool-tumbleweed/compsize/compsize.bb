SUMMARY = "Utility for measuring compression ratio of files on btrfs"
DESCRIPTION = "compsize takes a list of files (given as arguments) on a btrfs \
filesystem and measures used compression types and effective \
compression ratio, producing a report."
LICENSE = "GPL-2.0-or-later"

PV = "1.5"

RPM_NAME = "compsize-1.5-3.5.aarch64.rpm"
RPM_HASH = "9949dec717b8c7d0210ffac53bdc80660a83862a6c9536b944beef25ea679162d6d1368b5def4e50b80171484d92c5d945e15e0c5596058496e482352fea1349"

RPROVIDES:${PN} += "compsize"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
