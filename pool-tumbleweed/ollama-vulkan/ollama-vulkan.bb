SUMMARY = "Ollama Module using Vulkan"
DESCRIPTION = "Ollama plugin module using Vulkan."
LICENSE = "MIT"

PV = "0.33.1"

RPM_NAME = "ollama-vulkan-0.33.1-1.1.aarch64.rpm"
RPM_HASH = "e1a68f9613035e6668923555337ac1a5432e28b14525a63f5859c9544ef4c8790ade2ac87b35f2297e079a9d2b0491bb1f6121e457c415856bf05757ebf407bb"

RPROVIDES:${PN} += "libggml-vulkan.so \
ollama-vulkan"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libggml-base.so.0 \
libm.so.6 \
libstdc++.so.6 \
libvulkan.so.1 \
ollama"

inherit rpm
