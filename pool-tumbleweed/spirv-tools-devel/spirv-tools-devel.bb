SUMMARY = "Development headers for the SPIR-V tool library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2026.3~rc1"

RPM_NAME = "spirv-tools-devel-2026.3~rc1-1.2.aarch64.rpm"
RPM_HASH = "1b567e3d454b78ab2d8073b6e084683c48d9f0f23fad16f2cd8d1538fedebfaaf7674321efb94fac5b7c49e9745cffc9baefe4f0ca22e33d195cedba475379ad"

RPROVIDES:${PN} += "cmake-SPIRV-Tools \
cmake-SPIRV-Tools-diff \
cmake-SPIRV-Tools-link \
cmake-SPIRV-Tools-lint \
cmake-SPIRV-Tools-opt \
cmake-SPIRV-Tools-reduce \
cmake-SPIRV-Tools-tools \
pkgconfig-SPIRV-Tools \
pkgconfig-SPIRV-Tools-shared \
spirv-tools-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libSPIRV-Tools-2026-3-rc1"

inherit rpm
