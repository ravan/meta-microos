SUMMARY = "Versatile tool for fast incremental file transfer"
DESCRIPTION = "Rsync is a fast and extraordinarily versatile file  copying  tool. It can copy \
locally, to/from another host over any remote shell, or to/from a remote rsync \
daemon. It offers a large number of options that control every aspect of its \
behavior and permit very flexible specification of the set of files to be \
copied. It is famous for its delta-transfer algorithm, which reduces the amount \
of data sent over the network by sending only the differences between the \
source files and the existing files in the destination. Rsync is widely used \
for backups and mirroring and as an improved copy command for everyday use."
LICENSE = "GPL-3.0-or-later"

PV = "3.4.3"

RPM_NAME = "rsync-3.4.3-2.3.aarch64.rpm"
RPM_HASH = "5f2126c4f563569cc679fef06019249520adaa956e9e9d507afeba3b5e487d78390d9a31d73478e64ebfb951e460178de4bb5be25dd09601c62871ab61cd425e"

RPROVIDES:${PN} += "rsync"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
grep \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblz4.so.1 \
libpopt.so.0 \
libxxhash.so.0 \
libz.so.1 \
libzstd.so.1 \
sed"

inherit rpm
