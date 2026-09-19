SUMMARY = "Development files for lucene++"
DESCRIPTION = "Development files for lucene++, a high-performance, full-featured text search engine written in C++"
LICENSE = "Apache-2.0 | LGPL-3.0-or-later"

PV = "3.0.9"

RPM_NAME = "lucene++-devel-3.0.9-4.5.aarch64.rpm"
RPM_HASH = "50e9a52c9cff6b74e6a8cd71fa1c552d36d0c9e7c91d6b57baf4880f92d096634d3e0e37c39eeffeecdec41cf673dd51eecf79ba8ce1d8581472d9b337ee83d3"

RPROVIDES:${PN} += "cmake-liblucene++ \
cmake-liblucene++-contrib \
lucene++-devel \
pkgconfig-liblucene++ \
pkgconfig-liblucene++-contrib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblucene++0"

inherit rpm
