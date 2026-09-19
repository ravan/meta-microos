SUMMARY = "Deep learning framework aka pytorch/Caffe2"
DESCRIPTION = "PyTorch enables fast, flexible experimentation and efficient production through \
a hybrid front-end, distributed training, and ecosystem of tools and libraries. \
The library is developed by Facebook and other groups. \
PyTorch provides two high-level features: \
* Tensor computing (like NumPy) with strong acceleration via graphics \
* processing units (GPU) Deep neural networks built on a tape-based autodiff \
  system"
LICENSE = "Apache-2.0 & Apache-2.0-with-LLVM-exception & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & MIT & Zlib"

PV = "2.13.0"

RPM_NAME = "python314-torch-openmpi4-2.13.0-1.2.aarch64.rpm"
RPM_HASH = "c562d22daed2b24e78633a9fd064fbb471d8493589a9ece2f3332b4a0324dea50e07d153adbf8b196a9849eea57d56345b7382b8b9d0a52f973b7ffdf2ef9569"

RPROVIDES:${PN} += "libshm.so \
libtorch-global-deps.so \
libtorch-python.so \
python3.14dist-torch \
python314-caffe2-openmpi4 \
python314-pytorch-openmpi4 \
python314-torch-openmpi4 \
python3dist-torch"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
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
libc.so.6 \
libc10.so \
libgcc-s.so.1 \
libm.so.6 \
libmpi.so.40 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
libtorch-cpu.so \
libtorch-openmpi4 \
libtorch.so \
libutf8-validity.so.36.1.0 \
python-abi \
python314-Jinja2 \
python314-filelock \
python314-fsspec \
python314-networkx \
python314-numpy \
python314-setuptools \
python314-sympy \
python314-typing-extensions"

inherit rpm
