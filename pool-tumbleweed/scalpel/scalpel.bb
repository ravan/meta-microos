SUMMARY = "Fast, filesystem-independent file carver"
DESCRIPTION = "Scalpel is a fast file carver that reads a database of header and footer \
definitions and extracts matching files or data fragments from a set of \
image files or raw device files. Scalpel is filesystem-independent and will \
carve files from FATx, NTFS, ext2/3, HFS+, or raw partitions. \
It is useful for both digital forensics investigation and file recovery."
LICENSE = "GPL-2.0+"

PV = "2.0"

RPM_NAME = "scalpel-2.0-7.36.aarch64.rpm"
RPM_HASH = "19a2bec3bac97493ac00845943716d556bc6f1b192a4b63bbe58e458913622766e145e39f0eb681dce2af7230990d6e7ba8575a1f9914a704cf1d333c2abbf41"

RPROVIDES:${PN} += "scalpel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libtre.so.5"

inherit rpm
