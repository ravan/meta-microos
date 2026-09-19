SUMMARY = "Encrypted overlay filesystem written in Go"
DESCRIPTION = "gocryptfs is built on top the excellent go-fuse FUSE library. \
This project was inspired by EncFS and strives to fix its \
security issues while providing good performance. \
 \
gocryptfs uses file-based encryption that is implemented as a \
mountable FUSE filesystem. Each file in gocryptfs is stored as \
one corresponding encrypted file on disk."
LICENSE = "MIT"

PV = "2.6.1"

RPM_NAME = "gocryptfs-2.6.1-1.9.aarch64.rpm"
RPM_HASH = "819ca62231560e928ccf8a6bc7e7eada2b9e99318e5f8d159ee309c1eed243013e728d5f3d50834571ea2e46e792956315e0dc339d2c68179b54005e3b43dbea"

RPROVIDES:${PN} += "gocryptfs"

RDEPENDS:${PN} += "/usr/bin/fusermount3 \
libc.so.6 \
libcrypto.so.3 \
util-linux-systemd"

inherit rpm
