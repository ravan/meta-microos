SUMMARY = "Deduplicating compressed read-only file system"
DESCRIPTION = "The Deduplicating Warp-speed Advanced Read-only File System. \
 \
DwarFS is a deduplicating compressed read-only file system \
particularly suited for very redundant data. \
Compared to SquashFS, it is typically more efficient."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.15.7"

RPM_NAME = "dwarfs-0.15.7-1.2.aarch64.rpm"
RPM_HASH = "e1ebf76298e706ee5092a6137d04bed57f35d01f73967d889c823696d5a258e3fc137932e4dcf44ed631056e051a6a544ee9c98575d0c5f746b221683389aadb"

RPROVIDES:${PN} += "dwarfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libdwarfs-common.so.0.15.7 \
libdwarfs-compressor.so.0.15.7 \
libdwarfs-decompressor.so.0.15.7 \
libdwarfs-extractor.so.0.15.7 \
libdwarfs-reader.so.0.15.7 \
libdwarfs-rewrite.so.0.15.7 \
libdwarfs-writer.so.0.15.7 \
libfmt.so.12 \
libfuse3.so.4 \
libgcc-s.so.1 \
libjemalloc.so.2 \
libstdc++.so.6"

inherit rpm
