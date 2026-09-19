SUMMARY = "DwarFS development files"
DESCRIPTION = "The Deduplicating Warp-speed Advanced Read-only File System. \
 \
DwarFS is a deduplicating compressed read-only file system \
particularly suited for very redundant data. \
Compared to SquashFS, it is typically more efficient. \
 \
This package contains the development files for DwarFS."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.15.7"

RPM_NAME = "dwarfs-devel-0.15.7-1.2.aarch64.rpm"
RPM_HASH = "31e98c1475816f9330ce7ae75b440aa7e78263d691e498bdec76c8fdfea5ac9040c59fde342ca9f3a77a1e8bf47a7140b968f34a5885c6e7e3bfd90f4827d977"

RPROVIDES:${PN} += "cmake-dwarfs \
dwarfs-devel"

RDEPENDS:${PN} += "libdwarfs0-15-7"

inherit rpm
