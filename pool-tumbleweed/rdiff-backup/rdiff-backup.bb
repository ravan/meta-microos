SUMMARY = "Convenient and transparent local/remote incremental mirror/backup"
DESCRIPTION = "rdiff-backup backs up one directory to another, possibly over a \
network. The target directory ends up a copy of the source directory, \
but extra reverse diffs are stored in a special subdirectory of that \
target directory, so you can still recover files lost some time ago. \
The idea is to combine the best features of a mirror and an incremental \
backup. rdiff-backup also preserves subdirectories, hard links, dev \
files, permissions, uid/gid ownership, and modification times. Also, \
rdiff-backup can operate in a bandwidth efficient manner over a pipe, \
like rsync. Thus you can use rdiff-backup and ssh to securely back a \
hard drive up to a remote location, and only the differences will be \
transmitted. Finally, rdiff-backup is easy to use and settings have \
sensical defaults."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.6"

RPM_NAME = "rdiff-backup-2.2.6-2.11.aarch64.rpm"
RPM_HASH = "e527a5abe9151434332955484fc0fe0b9228f9f35296bb9ad1422e5660e908e685ed00cc177251552749e2537cecf5a4bb8d0194cfaae20f55e871bea34420d6"

RPROVIDES:${PN} += "python3.13dist-rdiff-backup \
python3dist-rdiff-backup \
rdiff-backup"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
librsync.so.2 \
python-abi \
python3-PyYAML \
python3-pylibacl \
python3-xattr"

inherit rpm
