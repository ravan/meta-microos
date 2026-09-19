SUMMARY = "Recovery tool for ext4 and ext3 filesystems"
DESCRIPTION = "extundelete is a utility that can recover deleted files from an ext3 or ext4 \
partition. extundelete uses the information stored in the partition's journal \
to attempt to recover a file that has been deleted from the partition. There is \
no guarantee that any particular file will be able to be undeleted, so always \
try to have a good backup system in place, or at least put one in place after \
recovering your files!"
LICENSE = "GPL-2.0-only"

PV = "0.2.4"

RPM_NAME = "extundelete-0.2.4-3.9.aarch64.rpm"
RPM_HASH = "1ed6ecf519e2592b3abd7cbbb225425cded45c3796d4e2c178b9b4ddbf71935750850fec39ec3771b3f0d9a8c5b377d5e8ced93fe611923d8ef48dc8a7147555"

RPROVIDES:${PN} += "extundelete"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
