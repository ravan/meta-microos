SUMMARY = "DwarFS dynamic library"
DESCRIPTION = "The Deduplicating Warp-speed Advanced Read-only File System. \
 \
DwarFS is a deduplicating compressed read-only file system \
particularly suited for very redundant data. \
Compared to SquashFS, it is typically more efficient. \
 \
This package contains the dynamic library for DwarFS."
LICENSE = "GPL-3.0-or-later & MIT"

PV = "0.15.7"

RPM_NAME = "libdwarfs0_15_7-0.15.7-1.2.aarch64.rpm"
RPM_HASH = "554cc1240b726373ae2304f5736771a05b05bccaf744ae9038520d9b5045a6ae1669982fa528bb724bae1063e9a366350d8c69f6ba2038c34a3cb091d60b964f"

RPROVIDES:${PN} += "libdwarfs-common.so.0.15.7 \
libdwarfs-compressor.so.0.15.7 \
libdwarfs-decompressor.so.0.15.7 \
libdwarfs-extractor.so.0.15.7 \
libdwarfs-reader.so.0.15.7 \
libdwarfs-rewrite.so.0.15.7 \
libdwarfs-writer.so.0.15.7 \
libdwarfs0-15-7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libarchive.so.13 \
libboost-chrono.so.1.91.0 \
libboost-filesystem.so.1.91.0 \
libboost-process.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfmt.so.12 \
libgcc-s.so.1 \
liblz4.so.1 \
liblzma.so.5 \
libm.so.6 \
libstdc++.so.6 \
libxxhash.so.0 \
libzstd.so.1"

inherit rpm
