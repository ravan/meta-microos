SUMMARY = "Utility for Creating romfs File Systems"
DESCRIPTION = "Genromfs is a tool for creating romfs file systems, which are \
lightweight, read-only file systems supported by the Linux kernel. \
Romfs file systems were traditionally used for the initial RAM disks \
used during installation."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.7"

RPM_NAME = "genromfs-0.5.7-1.12.aarch64.rpm"
RPM_HASH = "27b566f8cb4877fd28db65ba0916346f766364d6939a45109435d385954caa4c410f49d0aaaf12805c216dca1a759d88036d9263d575fa3ea878c5d7516b51ac"

RPROVIDES:${PN} += "genromfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
