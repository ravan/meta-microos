SUMMARY = "Tools Used for the Macintosh's Hierarchical File System"
DESCRIPTION = "HFS is the Hierarchical File System used on modern Macintosh computers. \
With this package, you can read and write Macintosh-formatted media, \
such as floppy disks, CD-ROMs, and SCSI hard disks on most UNIX \
platforms. You can also format raw media into an HFS volume."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "hfsutils-3.2.6-1247.9.aarch64.rpm"
RPM_HASH = "ee15c7f382119c0285ba0c804eef030c1174bc4c7aeca0ef1875010208f843c56ce94187905bc25015887e6e4fdb3288e5c2df5828db2a4baeea4ce0295adade"

RPROVIDES:${PN} += "hfsutils"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
