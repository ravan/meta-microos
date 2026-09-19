SUMMARY = "A collection of tools, libraries and tests for shader compilation"
DESCRIPTION = "A collection of tools, libraries and tests for shader compilation. \
Included are: \
 \
* glslc, a command line compiler for GLSL/HLSL to SPIR-V, and \
* libshaderc, a library API for doing the same. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools."
LICENSE = "Apache-2.0"

PV = "2026.3"

RPM_NAME = "shaderc-2026.3-1.2.aarch64.rpm"
RPM_HASH = "9aaeaba60f874bdf0aff30dd2936c68f5327a42e36e4220c25d3beeb784728b178da9972a8cc972661288c09371b474c2e3a43fbe6ff67248de1ca63ee17b5bc"

RPROVIDES:${PN} += "shaderc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libc.so.6 \
libgcc-s.so.1 \
libglslang.so.16 \
libstdc++.so.6"

inherit rpm
