SUMMARY = "Tool That Can Guess a Lost Partition Table"
DESCRIPTION = "Gpart is a small tool that tries to guess what partitions are on a PC \
type hard disk in case the primary partition table was damaged. Gpart \
supports, among others, partitions formatted as ext2, FAT 12/16/32, \
ReiserFS, NTFS, and HPFS. Read the file \
/usr/share/doc/packages/gpart/README and the gpart man page before \
using gpart."
LICENSE = "GPL-2.0+"

PV = "0.3"

RPM_NAME = "gpart-0.3-1.34.aarch64.rpm"
RPM_HASH = "446a10bb47019d2a191531c54e578670d4491dd780c009a2a7058e7e78e264ecb26fcbb77140d2de5eeb8ff33e5a37255a24ff790347d88d165d348d734700b3"

RPROVIDES:${PN} += "gpart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
