SUMMARY = "A C++ interface for running inference with large language models"
DESCRIPTION = "The llama.cpp library provides a C++ interface for running inference \
with large language models (LLMs). Initially designed to support Meta's \
LLaMA model, it has since been extended to work with a variety of other models. \
 \
This package includes the shared libraries necessary for running applications \
that depend on libllama.so."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libllama0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "23b57fc5c7bec9ae391084cb90100be4c432aa9d59a145a1807e9cc9f3d758949611011501e9593baff7bb038aae59abe5b5fcd4e8ef9e5a93476542ce33e4d9"

RPROVIDES:${PN} += "libllama.so.0 \
libllama0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libggml.so.0 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
