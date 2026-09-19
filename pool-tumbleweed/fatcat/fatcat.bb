SUMMARY = "FAT filesystems explore, extract, repair, and forensic tool"
DESCRIPTION = "This tool is designed to manipulate FAT filesystems, in order to explore, \
extract, repair, recover and forensic them. It currently supports FAT12, FAT16 \
and FAT32."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "fatcat-1.1.1-1.5.aarch64.rpm"
RPM_HASH = "4a990d04ea1af9e7dc81ec644892b8f448433e7406392b710134b4347ce9dd27e53218670596271f67c6004222e3b3186681658cd0965647169da9275d03c500"

RPROVIDES:${PN} += "fatcat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
