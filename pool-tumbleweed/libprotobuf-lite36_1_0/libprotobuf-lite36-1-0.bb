SUMMARY = "Protocol Buffers - Google's data interchange format"
DESCRIPTION = "Protocol Buffers are a way of encoding structured data in an efficient yet \
extensible format. Google uses Protocol Buffers for almost all of its internal \
RPC protocols and file formats."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "libprotobuf-lite36_1_0-36.1-1.1.aarch64.rpm"
RPM_HASH = "5a494690ba58413cd8d804ff0856ac961aa4fe2b07e576e4199c21b8ba6cbde8a3b5275fbcefb854a225c4cc35628c6dec650ce1044c797553fe48adf35e676c"

RPROVIDES:${PN} += "libprotobuf-lite.so.36.1.0 \
libprotobuf-lite36-1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-int128.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libutf8-validity.so.36.1.0"

inherit rpm
