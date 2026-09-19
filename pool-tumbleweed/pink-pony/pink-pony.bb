SUMMARY = "3D racing game with ponies"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "pink-pony-1.4.1-6.10.aarch64.rpm"
RPM_HASH = "423b99e106602b481e82656dea22ca873c4462ffe866feff15931b13ef5502d8987417122cae5e75c8389bd79ba20e9a9467591752c01c84033d0d96723656f3"

RPROVIDES:${PN} += "pink-pony"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libIL.so.1 \
libImath-3-2.so.30 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libabsl-base-cpu-detect.so.2608.0.0 \
libabsl-base.so.2608.0.0 \
libabsl-city.so.2608.0.0 \
libabsl-civil-time.so.2608.0.0 \
libabsl-cord-internal.so.2608.0.0 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-handle.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-crc-cord-state.so.2608.0.0 \
libabsl-crc-internal.so.2608.0.0 \
libabsl-crc32c.so.2608.0.0 \
libabsl-debugging-internal.so.2608.0.0 \
libabsl-decode-rust-punycode.so.2608.0.0 \
libabsl-demangle-internal.so.2608.0.0 \
libabsl-demangle-rust.so.2608.0.0 \
libabsl-die-if-null.so.2608.0.0 \
libabsl-examine-stack.so.2608.0.0 \
libabsl-exponential-biased.so.2608.0.0 \
libabsl-flags-commandlineflag-internal.so.2608.0.0 \
libabsl-flags-commandlineflag.so.2608.0.0 \
libabsl-flags-config.so.2608.0.0 \
libabsl-flags-internal.so.2608.0.0 \
libabsl-flags-marshalling.so.2608.0.0 \
libabsl-flags-private-handle-accessor.so.2608.0.0 \
libabsl-flags-program-name.so.2608.0.0 \
libabsl-flags-reflection.so.2608.0.0 \
libabsl-graphcycles-internal.so.2608.0.0 \
libabsl-hardening.so.2608.0.0 \
libabsl-hash.so.2608.0.0 \
libabsl-hashtablez-sampler.so.2608.0.0 \
libabsl-int128.so.2608.0.0 \
libabsl-kernel-timeout-internal.so.2608.0.0 \
libabsl-leak-check.so.2608.0.0 \
libabsl-log-entry.so.2608.0.0 \
libabsl-log-globals.so.2608.0.0 \
libabsl-log-initialize.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-conditions.so.2608.0.0 \
libabsl-log-internal-fnmatch.so.2608.0.0 \
libabsl-log-internal-format.so.2608.0.0 \
libabsl-log-internal-globals.so.2608.0.0 \
libabsl-log-internal-log-sink-set.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-log-internal-proto.so.2608.0.0 \
libabsl-log-internal-structured-proto.so.2608.0.0 \
libabsl-log-severity.so.2608.0.0 \
libabsl-log-sink.so.2608.0.0 \
libabsl-malloc-internal.so.2608.0.0 \
libabsl-random-distributions.so.2608.0.0 \
libabsl-random-internal-entropy-pool.so.2608.0.0 \
libabsl-random-internal-platform.so.2608.0.0 \
libabsl-random-internal-randen-hwaes-impl.so.2608.0.0 \
libabsl-random-internal-randen-hwaes.so.2608.0.0 \
libabsl-random-internal-randen-slow.so.2608.0.0 \
libabsl-random-internal-randen.so.2608.0.0 \
libabsl-random-internal-seed-material.so.2608.0.0 \
libabsl-random-seed-gen-exception.so.2608.0.0 \
libabsl-random-seed-sequences.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-raw-logging-internal.so.2608.0.0 \
libabsl-source-location.so.2608.0.0 \
libabsl-spinlock-wait.so.2608.0.0 \
libabsl-stacktrace.so.2608.0.0 \
libabsl-status.so.2608.0.0 \
libabsl-statusor.so.2608.0.0 \
libabsl-str-format-internal.so.2608.0.0 \
libabsl-strerror.so.2608.0.0 \
libabsl-strings-internal.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-symbolize.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libabsl-time-zone.so.2608.0.0 \
libabsl-time.so.2608.0.0 \
libabsl-tracing-internal.so.2608.0.0 \
libabsl-utf8-for-code-point.so.2608.0.0 \
libabsl-vlog-config-internal.so.2608.0.0 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libglfw.so.2 \
libm.so.6 \
libprotobuf.so.36.1.0 \
libsigc-2.0.so.0 \
libstdc++.so.6 \
libutf8-range.so.36.1.0 \
libutf8-validity.so.36.1.0 \
pink-pony-data"

inherit rpm
