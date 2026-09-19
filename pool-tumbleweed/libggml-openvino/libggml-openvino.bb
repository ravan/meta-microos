SUMMARY = "A tensor library for C++ (OpenVINO backend)"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects. \
 \
This package includes the OpenVINO backend for ggml."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libggml-openvino-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "e561ceab540398d2cdafb913e8a23c819ffeb5381446efeaab9314bdb9f1282ab8d707fbd69f282c9a702ded247e2af52753e2a4aa3e9748c519a818a046fa05"

RPROVIDES:${PN} += "libggml-openvino \
libggml-openvino.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenCL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libm.so.6 \
libopenvino.so.2631 \
libstdc++.so.6 \
libtbb.so.12"

inherit rpm
