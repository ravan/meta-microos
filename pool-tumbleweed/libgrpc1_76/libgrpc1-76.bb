SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "libgrpc1_76-1.76.0-3.12.aarch64.rpm"
RPM_HASH = "6b66e65a18bf0e151b058e951f2095bdd1617b2b93f18a15fe3480e946018979e1ae646618c610030f963ef8cc5ca2e28bbb45d99bfc86176a52721d06527223"

RPROVIDES:${PN} += "libgrpc-authorization-provider.so.1.76 \
libgrpc-plugin-support.so.1.76 \
libgrpc1-76"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-kernel-timeout-internal.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-random-internal-entropy-pool.so.2608.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2608.0.0 \
libabsl-random-internal-randen-slow.so.2608.0.0 \
libabsl-random-internal-randen.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libabsl-vlog-config-internal.so.2608.0.0 \
libaddress-sorting.so.51 \
libc.so.6 \
libcares.so.2 \
libgcc-s.so.1 \
libgpr.so.51 \
libprotobuf.so.36.1.0 \
libprotoc.so.36.1.0 \
libre2.so.11 \
libstdc++.so.6 \
libupb-mem-lib.so.51 \
libupb-message-lib.so.51 \
libupb-reflection-lib.so.51 \
libupb-textformat-lib.so.51 \
libupb-wire-lib.so.51 \
libz.so.1"

inherit rpm
