SUMMARY = "Parallel, indexing version of XZ"
DESCRIPTION = "The existing XZ Utils provide great compression in the .xz file format, but \
they produce just one big block of compressed data. Pixz instead produces a \
collection of smaller blocks which makes random access to the original data \
possible. This is especially useful for large tarballs. \
 \
Pixz supports automatic indexing and parallel compression and decompression \
using all available CPU cores."
LICENSE = "BSD-2-Clause"

PV = "1.0.7"

RPM_NAME = "pixz-1.0.7-1.19.aarch64.rpm"
RPM_HASH = "cc883ea663031bdeedb530b3120c58090b7b476c892dd538a1321fc608dfa01907f78f46d0e7bb00388a9d91af2c5d5dc9c7cbeb451e0e3f5dd57b0031ecd0ce"

RPROVIDES:${PN} += "pixz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
liblzma.so.5"

inherit rpm
