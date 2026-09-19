SUMMARY = "Header files for the shaderc library"
DESCRIPTION = "A compiler library for GLSL/HLSL to SPIR-V. \
 \
Shaderc wraps around core functionality in glslang and SPIRV-Tools"
LICENSE = "Apache-2.0"

PV = "2026.3"

RPM_NAME = "shaderc-devel-2026.3-1.2.aarch64.rpm"
RPM_HASH = "0e6f67508579d09691182115f5071fa93d4e9640ec4ca8636bf3b1c68f52e6c1c367164869311dc99c8c899292115adec9cd6eb0897cb93a05fcfff979858d90"

RPROVIDES:${PN} += "pkgconfig-shaderc \
shaderc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libshaderc-shared1"

inherit rpm
