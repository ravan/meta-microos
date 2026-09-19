SUMMARY = "A Program for Compressing Files with the Lempel–Ziv–Markov algorithm"
DESCRIPTION = "The xz command is a program for compressing files. \
* Average compression ratio of LZMA is about 30% better than that of \
  gzip, and 15% better than that of bzip2. \
* Decompression speed is only little slower than that of gzip, being \
  two to five times faster than bzip2. \
* In fast mode, compresses faster than bzip2 with a comparable \
  compression ratio. \
* Achieving the best compression ratios takes four to even twelve \
  times longer than with bzip2. However, this does not affect \
  decompressing speed. \
* Very similar command line interface to what gzip and bzip2 have."
LICENSE = "0BSD & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "5.8.3"

RPM_NAME = "xz-5.8.3-1.3.aarch64.rpm"
RPM_HASH = "4b793e4efd4aa3e7c965e0caab09b9b548141686fe96358aafe4f3218b6a3118409900e2b1778e88eb5517f823f67451670e35097b9d75cb3d0abf8a7ec7d15c"

RPROVIDES:${PN} += "lzma \
xz"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblzma.so.5"

inherit rpm
