SUMMARY = "A tensor library for C++ (Vulkan backend)"
DESCRIPTION = "A tensor library for C++. It was created originally to support llama.cpp \
and WhisperCpp projects. \
 \
This package includes the Vulkan backend for ggml."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "libggml-vulkan-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "5e408b30c8ba2bfca86ac0ce8dcc8ad21478a8dfccc65b87d61a4910291427631c445420a778cad717585170714ab2975761551c45782b298c6dd3c38c61efad"

RPROVIDES:${PN} += "libggml-vulkan \
libggml-vulkan.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1"

inherit rpm
