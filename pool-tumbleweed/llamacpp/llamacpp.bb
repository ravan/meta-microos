SUMMARY = "Inference of Meta's LLaMA model (and others) in pure C/C++"
DESCRIPTION = "The llama.cpp library provides a C++ interface for running inference \
with large language models (LLMs). Initially designed to support Meta's \
LLaMA model, it has since been extended to work with a variety of other models. \
 \
This package includes the llama-cli tool to run inference using the library."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "llamacpp-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "bc4c1c6dcb62c74a856c3bfef9fd431b7eb512e37d800f1ec5fa5e5fc39fd4557edfe56cc4f2c99a50e6ffab403fc2eca80155c48492af167ec46457ceba36f0"

RPROVIDES:${PN} += "libllama-batched-bench-impl.so \
libllama-bench-impl.so \
libllama-cli-impl.so \
libllama-completion-impl.so \
libllama-fit-params-impl.so \
libllama-perplexity-impl.so \
libllama-quantize-impl.so \
libllama-server-impl.so \
llamacpp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libggml-base.so.0 \
libggml.so.0 \
libllama-common.so.0 \
libllama.so.0 \
libm.so.6 \
libmtmd.so.0 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
