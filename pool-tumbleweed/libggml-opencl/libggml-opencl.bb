SUMMARY = "A tensor library for C++ (OpenCL backend)"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects. \
 \
This package includes the OpenCL backend for ggml."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libggml-opencl-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "477591fb335c9c98e4c6650bfd2eaa23696ed44fe4236e6ad2d69f9d5ea7c505844c2833f1e415a093529351ac2ab7ac0d279214c9ce2b22eccde5b0a4db8e66"

RPROVIDES:${PN} += "libggml-opencl \
libggml-opencl.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
