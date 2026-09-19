SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for the C++ Compute module"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libarrow_compute2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "01a11117879cb137c3056b55f98c63e01a5735e9750f3149347da6dba5730ffa448e4579158408eef7c02aa3f00af5add752c6cc2ee89806b66587bd4a258cd5"

RPROVIDES:${PN} += "libarrow-compute.so.2500 \
libarrow-compute2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libre2.so.11 \
libstdc++.so.6 \
libutf8proc.so.3"

inherit rpm
