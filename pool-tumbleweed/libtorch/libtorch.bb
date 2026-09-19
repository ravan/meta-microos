SUMMARY = "Library which used by python-torch"
DESCRIPTION = "Library which is used by python-torch"
LICENSE = "Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & MIT & Zlib"

PV = "2.13.0"

RPM_NAME = "libtorch-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "a10aac767686bfce8ef94625e81849318892d52dfce6915eb683db8ef5b69144d87c0f11224caa4e5f984fe9d715f660734bcece551394a964194fd9ad643f95"

RPROVIDES:${PN} += "libc10.so \
libtorch \
libtorch-cpu.so \
libtorch.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
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
libatomic.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libnuma.so.1 \
libopenblas.so.0 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libutf8-validity.so.36.1.0"

inherit rpm
