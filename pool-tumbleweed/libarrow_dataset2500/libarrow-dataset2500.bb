SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for Dataset API support."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libarrow_dataset2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "9a2f8551d4ee23287835aa943cefb2470c8efbf4140fa385e2de6e7755c967b02b0a1555d916c407f6f735ad076c751d35a7bac747217486baa4d895759119d6"

RPROVIDES:${PN} += "libarrow-dataset.so.2500 \
libarrow-dataset2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow-acero.so.2500 \
libarrow-compute.so.2500 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.2500 \
libstdc++.so.6"

inherit rpm
