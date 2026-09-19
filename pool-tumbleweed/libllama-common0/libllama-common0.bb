SUMMARY = "Common library for llama.cpp"
DESCRIPTION = "The llama.cpp library provides a C++ interface for running inference \
with large language models (LLMs). Initially designed to support Meta's \
LLaMA model, it has since been extended to work with a variety of other models. \
 \
This package includes the shared libraries necessary for running applications \
that depend on libllama-common.so."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libllama-common0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "f510aa9758205d469ead2049ac64fc96ab10a50d0c86683d222c737df989a9063ed508360e4b90016101114f44770a8744a749844d04549340a67cdb8e0bc543"

RPROVIDES:${PN} += "libllama-common.so.0 \
libllama-common0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libggml-base.so.0 \
libggml.so.0 \
libllama.so.0 \
libm.so.6 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
