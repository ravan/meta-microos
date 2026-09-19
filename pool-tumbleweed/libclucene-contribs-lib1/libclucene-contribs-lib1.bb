SUMMARY = "Language specific text analyzers for clucene-core"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package contains language specific text analyzers for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-contribs-lib1-2.3.3.4-19.10.aarch64.rpm"
RPM_HASH = "9d60dae451c590c0dbd3af82741b4e736d49cebc3cb4c2a3a18a5aab3d332998dab5cb0588bff7384d51bc923eb8c11683cbcc463522429f2b68089694b7b429"

RPROVIDES:${PN} += "libclucene-contribs-lib.so.1 \
libclucene-contribs-lib1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-core.so.1 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
