SUMMARY = "Filesystem client based on SSH file transfer protocol"
DESCRIPTION = "SSHFS is a filesystem client based on the SSH File Transfer Protocol. \
Since most SSH servers already support this protocol it is very easy to \
set up: i.e. on the server side there's nothing to do.	On the client \
side mounting the filesystem is as easy as logging into the server with \
openssh (ssh)."
LICENSE = "GPL-2.0-or-later"

PV = "3.7.6"

RPM_NAME = "sshfs-3.7.6-1.3.aarch64.rpm"
RPM_HASH = "9eb650eb24ee9bd3e0ebb0c791feb0f34c4ab1270019680a161b902eb375d42bcb4862c96a91d6622fce272603419ea4ba07a7706abf6175ec7a3ea7b19d0f53"

RPROVIDES:${PN} += "sshfs"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libglib-2.0.so.0"

inherit rpm
