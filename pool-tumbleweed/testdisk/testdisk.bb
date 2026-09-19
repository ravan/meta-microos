SUMMARY = "Tool to Recover and Fix Partitions"
DESCRIPTION = "TestDisk is a data recovery software primarily designed to help recover lost \
partitions and/or make non-booting disks bootable again."
LICENSE = "GPL-2.0-only"

PV = "7.2"

RPM_NAME = "testdisk-7.2-1.11.aarch64.rpm"
RPM_HASH = "0a25ee2bda09c7d72b49fd67db2da9a7b32dcc676b56ca5872e1487a15b9afc5cdcde47d29cc338f173b5992fdcc85ecb89b10594fe91228483d6b0345bb8c8f"

RPROVIDES:${PN} += "testdisk"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libext2fs.so.2 \
libncursesw.so.6 \
libntfs-3g.so.90 \
libtinfo.so.6"

inherit rpm
