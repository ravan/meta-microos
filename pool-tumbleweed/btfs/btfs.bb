SUMMARY = "A BitTorrent file system based on FUSE"
DESCRIPTION = "With BTFS, you can mount any .torrent file or magnet link and then use it as \
any read-only directory in your file tree. The contents of the files will be \
downloaded on-demand as they are read by applications. Tools like ls, cat and \
cp work as expected. Applications like media players can also work without changes."
LICENSE = "GPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "btfs-3.3-1.1.aarch64.rpm"
RPM_HASH = "a9ace68e02227750a18be725937b54a433a9ff6b409def60622489b46af13b4ef0770680bab5e61557bd4a5d09e2f6bd6c2f040a7de8dfcb2b497d2e6ee07977"

RPROVIDES:${PN} += "btfs"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libfuse3.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0"

inherit rpm
