SUMMARY = "A tensor library for C++ (CPU backend)"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects. \
 \
This package includes the CPU backend for ggml."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libggml-cpu-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "dc887cd1e6abe97ab2875a4d271da3b0cee1f6ef7d393dc2ff81b1dc6b734a5317e66b885d0d0c4ea90623ead39d5cf7b47c26dbb8ff093bffade90b1cf1a1c0"

RPROVIDES:${PN} += "libggml-cpu \
libggml-cpu-armv8.0-1.so \
libggml-cpu-armv8.2-1.so \
libggml-cpu-armv8.2-2.so \
libggml-cpu-armv8.2-3.so \
libggml-cpu-armv8.6-1.so \
libggml-cpu-armv8.6-2.so \
libggml-cpu-armv9.2-1.so \
libggml-cpu-armv9.2-2.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
