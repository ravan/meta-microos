SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for the Parquet format."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libparquet2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "1372e4d404dc8d7a09f20d18e6b8a8ca9d974b6677b8f0e551d088bffffa3de7555ba1f3555606b060ba290494ecf2c7c0a3c97279e2b0973fb62d213cf2bffe"

RPROVIDES:${PN} += "libparquet.so.2500 \
libparquet2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.2500 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libthrift-0.24.0.so"

inherit rpm
