SUMMARY = "C++ implementation of the Lucene text search engine"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "libclucene-core1-2.3.3.4-19.10.aarch64.rpm"
RPM_HASH = "3cd93494a2b147db081799e17a1671fb09e6c9fd9d3fc3f75422424b23f97b8a627ab87df05b9dfabceb7e0edd911063bb79967fc9d74eeb885736337dfc9dbc"

RPROVIDES:${PN} += "libclucene-core.so.1 \
libclucene-core1 \
libclucene2 \
libclucene2-setStartVersion"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libclucene-shared.so.1 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
