SUMMARY = "Development files for ggml"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects. \
 \
This package includes the development files necessary for building applications \
that depend on ggml."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "ggml-devel-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "35f5ee54a9602996a0dadaa7691e524db8a3cfdc8a8c32021ce344bd894ed14c049671c8efe4d67b51d1fda44fba59fb5bb9be9bf595645f86fd3edda1d002de"

RPROVIDES:${PN} += "cmake-ggml \
ggml-devel"

RDEPENDS:${PN} += ""

inherit rpm
