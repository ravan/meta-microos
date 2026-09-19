SUMMARY = "Development platform for in-memory data - development files"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the development libraries and headers for \
the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "apache-parquet-devel-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "f58e6a46e4444616a8634ff1d520a7dbe1c8aec57412f7d75b4e212c63ee161303ac334cf81cb8448ec341ff3a9bd356f86d84d62f7a314befd34c08e14ed591"

RPROVIDES:${PN} += "apache-parquet-devel \
cmake-Parquet \
pkgconfig-parquet"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libparquet2500 \
pkgconfig-arrow"

inherit rpm
