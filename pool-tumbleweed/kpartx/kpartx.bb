SUMMARY = "Manages partition tables on device-mapper devices"
DESCRIPTION = "The kpartx program maps linear devmaps to device partitions, which \
makes multipath maps partionable."
LICENSE = "GPL-2.0-only"

PV = "0.15.1+229+suse.6c6f63e"

RPM_NAME = "kpartx-0.15.1+229+suse.6c6f63e-1.1.aarch64.rpm"
RPM_HASH = "7596f38e8585967825522f23de0fd4ffbfe594f59285b22fd7f5b46249e3e570dd10b9a34045aa6c9004a9a49cb27a39a0cf208b8cbbd74d1bafa41b43fb0b57"

RPROVIDES:${PN} += "kpartx"

RDEPENDS:${PN} += "/usr/bin/sh \
device-mapper \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libgcc-s.so.1"

inherit rpm
