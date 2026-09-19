SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for the Acero streaming execution engine"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libarrow_acero2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "e11697372ca7c6b765c127f8c596c0e81a29535330b05f5cd273e8323d7623526a1ffc20ee833d1640728c58b5888c379f3d2c69ee934b46b3cb2d4ad1c306f0"

RPROVIDES:${PN} += "libarrow-acero.so.2500 \
libarrow-acero2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libarrow-compute.so.2500 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
