SUMMARY = "Tool and library for SPIR-V reflection and disassembly"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages. \
 \
Features: \
 \
* Conversion of SPIR-V to GLSL, MSL or HLSL \
* Conversion of SPIR-V to a JSON reflection format \
* Reflection API to simplify the creation of Vulkan pipeline layouts \
* Reflection API to modify and tweak OpDecorations \
* Support for 'all' of vertex, fragment, tessellation, geometry and \
  compute shaders."
LICENSE = "Apache-2.0 | MIT"

PV = "1.4.313.0"

RPM_NAME = "spirv-cross-1.4.313.0-1.5.aarch64.rpm"
RPM_HASH = "eb401362b8478718b312ceb752543b4f61c8f45611669915516ef1620add4f96731d2f667112f1850761f14b9434846ca7a6daaa82d3236221019b9b3daaef8d"

RPROVIDES:${PN} += "spirv-cross"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
