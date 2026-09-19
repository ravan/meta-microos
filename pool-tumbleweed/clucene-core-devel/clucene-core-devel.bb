SUMMARY = "Development files for clucene library"
DESCRIPTION = "CLucene is a C++ port of Lucene. It is a high-performance, full-featured text \
search engine written in C++. CLucene is faster than lucene as it is written \
in C++. \
 \
This package holds the development files for clucene."
LICENSE = "Apache-2.0 | LGPL-2.1-only"

PV = "2.3.3.4"

RPM_NAME = "clucene-core-devel-2.3.3.4-19.10.aarch64.rpm"
RPM_HASH = "be9635a564d97e56a7ae37270f6bf1483ff74c67101967c4d39b23c10dd2688a939d658c89f3c34d725f7095d4597caccd0567a4379f483e17e34a29deca2107"

RPROVIDES:${PN} += "clucene-core-devel \
pkgconfig-libclucene-core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libclucene-contribs-lib1 \
libclucene-core1 \
libclucene-shared1 \
libstdc++-devel"

inherit rpm
