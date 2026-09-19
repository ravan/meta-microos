SUMMARY = "A tensor library for C++ (base)"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects. \
 \
This package includes the base shared library for ggml."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libggml-base0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "529ab8605acc1986939519a3808ace7ecf1364e47abec8f8c300aacab3d1192bdbfa99791b8aeb6a29ab98927068f9a0cad718f169cc28b2882af5d615bc8082"

RPROVIDES:${PN} += "libggml-base.so.0 \
libggml-base0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
