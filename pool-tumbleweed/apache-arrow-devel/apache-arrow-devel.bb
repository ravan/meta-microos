SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the development libraries and headers for \
Apache Arrow."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "apache-arrow-devel-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "b5129566591a4e71532c3ea4a2b21f6185af2705ffffb3adac467f0de6ff24c802a4635926236675c972e8c9eb7c5963ff22e040ab071409950a986b6fc94f7b"

RPROVIDES:${PN} += "apache-arrow-devel \
cmake-Arrow \
cmake-ArrowAcero \
cmake-ArrowCompute \
cmake-ArrowDataset \
cmake-ArrowFlight \
cmake-ArrowFlightSql \
cmake-arrow \
pkgconfig-arrow \
pkgconfig-arrow-acero \
pkgconfig-arrow-compute \
pkgconfig-arrow-csv \
pkgconfig-arrow-dataset \
pkgconfig-arrow-filesystem \
pkgconfig-arrow-flight \
pkgconfig-arrow-flight-sql \
pkgconfig-arrow-json"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libarrow-acero2500 \
libarrow-compute2500 \
libarrow-dataset2500 \
libarrow-flight-sql2500 \
libarrow-flight2500 \
libarrow2500 \
pkgconfig-arrow \
pkgconfig-arrow-acero \
pkgconfig-arrow-compute \
pkgconfig-arrow-flight \
pkgconfig-parquet"

inherit rpm
