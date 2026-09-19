SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "The reference implementation of the gRPC protocol, done on top of \
HTTP/2 with support for synchronous and asynchronous calls. gRPC uses \
Protocol Buffers as the Interface Definition Language by default."
LICENSE = "Apache-2.0"

PV = "1.76.0"

RPM_NAME = "libgrpc51-1.76.0-3.12.aarch64.rpm"
RPM_HASH = "f0a2f0a1b1affef7f06f4b815a3afa99d8e858935166f9fe69c988be9622cafa7aa48c4c66f2d037b082b8a6186b13ba8074715402589a73a9b9023f639d3e3e"

RPROVIDES:${PN} += "libaddress-sorting.so.51 \
libgpr.so.51 \
libgrpc-unsecure.so.51 \
libgrpc.so.51 \
libgrpc51 \
libutf8-range-lib.so.51"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-marshalling.so.2608.0.0 \
libabsl-flags-reflection.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-kernel-timeout-internal.so.2608.0.0 \
libabsl-log-globals.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-random-internal-entropy-pool.so.2608.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2608.0.0 \
libabsl-random-internal-randen-slow.so.2608.0.0 \
libabsl-random-internal-randen.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libabsl-time-zone.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libabsl-vlog-config-internal.so.2608.0.0 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libre2.so.11 \
libssl.so.3 \
libstdc++.so.6 \
libupb-base-lib.so.51 \
libupb-hash-lib.so.51 \
libupb-json-lib.so.51 \
libupb-mem-lib.so.51 \
libupb-message-lib.so.51 \
libupb-reflection-lib.so.51 \
libupb-textformat-lib.so.51 \
libupb-wire-lib.so.51 \
libz.so.1"

inherit rpm
