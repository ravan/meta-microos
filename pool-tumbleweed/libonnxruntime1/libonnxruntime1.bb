SUMMARY = "ONNX Runtime shared library"
DESCRIPTION = "This package contains the ONNX Runtime shared library needed at runtime \
by applications and language bindings."
LICENSE = "Apache-2.0 & MIT & MPL-2.0 & BSL-1.0 & BSD-2-Clause"

PV = "1.27.0"

RPM_NAME = "libonnxruntime1-1.27.0-2.1.aarch64.rpm"
RPM_HASH = "ab843b31dc0d2f370bf7066c8b56e6d8ef217ce7d130bce14d7430f1ba887a39f20efac3f242c5940f436f6b246047557c50d805f2bd232871cf4813092bb37e"

RPROVIDES:${PN} += "libonnxruntime.so.1 \
libonnxruntime1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libcpuinfo-suse.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.3.21.12.0 \
libre2.so.11 \
libstdc++.so.6"

inherit rpm
