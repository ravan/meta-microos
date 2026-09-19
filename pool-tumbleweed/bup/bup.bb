SUMMARY = "Backup program based on git"
DESCRIPTION = "Very efficient backup system based on the git packfile format, \
providing fast incremental saves and global deduplication \
(among and within files, including virtual machine images)."
LICENSE = "LGPL-2.0-only"

PV = "0.33.10"

RPM_NAME = "bup-0.33.10-2.1.aarch64.rpm"
RPM_HASH = "8be2bfa2efd8c5c8f9dbbfbe0e022385a47a21b92a377f90141e0e1ce9cf1de95eaae8877cba2ed65c5b049c730b936cb3e5e7482998f3a11d8c6d31e124312d"

RPROVIDES:${PN} += "bup"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libpython3.13.so.1.0 \
par2 \
python3 \
python3-fuse \
python3-pylibacl \
python3-pyxattr \
python3-tornado"

inherit rpm
