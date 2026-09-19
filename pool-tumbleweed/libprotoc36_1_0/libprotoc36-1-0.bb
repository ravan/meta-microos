SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "libprotoc36_1_0-36.1-1.1.aarch64.rpm"
RPM_HASH = "5099062011f3beea4a71a765bffbfe48a161f8ee0d3b2726a643c5828a342bdce93766f66ec4539800cbb9c8df7b6a91f2a20506e1bf842686620092aea1586a"

RPROVIDES:${PN} += "libprotoc.so.36.1.0 \
libprotoc36-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-die-if-null.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libutf8-range.so.36.1.0 \
libutf8-validity.so.36.1.0"

inherit rpm
