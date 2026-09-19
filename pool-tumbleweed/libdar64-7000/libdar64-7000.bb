SUMMARY = "Backup and Restore Application"
DESCRIPTION = "Dar stands for Disk ARchive and is a hardware independent backup \
solution. Dar uses catalogs (unlike tar), so it is possible to extract \
a single file without having to read the whole archive, and it is also \
possible to create incremental backups. \
 \
Dar archives can also be created, or used, via the libdar library (for \
example with KDar, a KDE application). \
 \
This package contains the library used by Dar and KDar."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "2.8.6"

RPM_NAME = "libdar64-7000-2.8.6-1.1.aarch64.rpm"
RPM_HASH = "595ad0091a59af3acca2359f430677b551b870e8126a4d0c578ebd576aaeccdea4bbb5cee62e951ac2bb858bca29f4205157a0f07ba92690f4aed8d5f1af8b7e"

RPROVIDES:${PN} += "libdar \
libdar64-7000 \
libdar64.so.7000"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libargon2.so.1 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libgcrypt.so.20 \
libgpgme.so.45 \
liblz4.so.1 \
liblzma.so.5 \
liblzo2.so.2 \
librhash.so.1 \
librsync.so.2 \
libssh.so.4 \
libstdc++.so.6 \
libthreadar.so.1000 \
libz.so.1 \
libzstd.so.1"

inherit rpm
