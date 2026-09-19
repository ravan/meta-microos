SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for Apache Arrow."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libarrow2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "4895709c58f538cec0997b2a8c56972a7282b1f699420f1016fd5afced0089a8627299fe793106f03cb0003e105cb67276be2016d5c93cde69929d9eec2f6c73"

RPROVIDES:${PN} += "libarrow.so.2500 \
libarrow2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libbrotlienc.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglog.so.2 \
liblz4.so.1 \
libm.so.6 \
libsnappy.so.1 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
