SUMMARY = "HTTP/2-based Remote Procedure Call implementation"
DESCRIPTION = "gRPC is a remote procedure call (RPC) framework. gRPC enables client \
and server applications to communicate, and enables the building of \
connected systems."
LICENSE = "Apache-2.0"

PV = "1.81.1"

RPM_NAME = "python314-grpcio-1.81.1-1.4.aarch64.rpm"
RPM_HASH = "6b8ece9500803dc57f435ebe06e734c78a60b258d9b601144a212351a4a933a7e4fadbad3826cf547bc537563eff0f25254de93a7289e527ed501a930f43f354"

RPROVIDES:${PN} += "python3.14dist-grpcio \
python314-grpcio \
python3dist-grpcio"

RDEPENDS:${PN} += "ca-certificates \
ld-linux-aarch64.so.1 \
libabsl-base.so.2608.0.0 \
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
libabsl-log-internal-globals.so.2608.0.0 \
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
libm.so.6 \
libre2.so.11 \
libssl.so.3 \
libstdc++.so.6 \
libz.so.1 \
python-abi \
python314-typing-extensions"

inherit rpm
