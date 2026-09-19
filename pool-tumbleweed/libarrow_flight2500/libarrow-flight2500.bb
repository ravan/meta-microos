SUMMARY = "Development platform for in-memory data - shared library"
DESCRIPTION = "Apache Arrow is a cross-language development platform for in-memory \
data. It specifies a standardized language-independent columnar memory \
format for flat and hierarchical data, organized for efficient \
analytic operations on modern hardware. It also provides computational \
libraries and zero-copy streaming messaging and interprocess \
communication. \
 \
This package provides the shared library for Arrow Flight"
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "libarrow_flight2500-25.0.0-1.4.aarch64.rpm"
RPM_HASH = "05379caee3ab6bbed1ae9584496fce82db06f4ee3ee2ad324370b987705013a271d963fd6f9097eccb6ee6334a14d3891c88bc6317ea00c0001f94e74f523e58"

RPROVIDES:${PN} += "libarrow-flight.so.2500 \
libarrow-flight2500"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.51 \
libgrpc++.so.1.76 \
libgrpc.so.51 \
libprotobuf.so.36.1.0 \
libstdc++.so.6"

inherit rpm
