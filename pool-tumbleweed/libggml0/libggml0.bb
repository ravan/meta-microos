SUMMARY = "A tensor library for C++"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libggml0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "b8b6984f52e51df1037b50a63993766e24575e2c8f9120255fc3656da917d0078274a7b053a153738d805871a7b39105211951911f3cd49f0539e3a8cd5ea805"

RPROVIDES:${PN} += "libggml.so.0 \
libggml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libggml-cpu \
libstdc++.so.6"

inherit rpm
