SUMMARY = "SPIR-V shader compiler library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2026.3"

RPM_NAME = "libshaderc_shared1-2026.3-1.2.aarch64.rpm"
RPM_HASH = "e243cb8fa54c4c43cee9ad94715493fddf924b4c6880cc72d40effc0cf625094b36c3f03405f402282855a6d77d94b22b0bb21e922791d2b254f224bf99432cb"

RPROVIDES:${PN} += "libshaderc-shared.so.1 \
libshaderc-shared1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.16 \
libstdc++.so.6"

inherit rpm
