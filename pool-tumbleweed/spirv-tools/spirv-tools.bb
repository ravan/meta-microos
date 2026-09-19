SUMMARY = "API and commands for processing SPIR-V modules"
DESCRIPTION = "The package includes an assembler, binary module parser, \
disassembler, and validator for SPIR-V."
LICENSE = "Apache-2.0"

PV = "2026.3~rc1"

RPM_NAME = "spirv-tools-2026.3~rc1-1.2.aarch64.rpm"
RPM_HASH = "fff8ef3c6a8053cec4e13107f33734bd0a2cd8f933b02fa9c592c94ecce194ca6a1346e8ad64635ffa6deeb964d920f3a09ea598bab418231d3c39cb691a5f87"

RPROVIDES:${PN} += "spirv-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-diff-2026.3~rc1.so \
libSPIRV-Tools-link-2026.3~rc1.so \
libSPIRV-Tools-lint-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libSPIRV-Tools-reduce-2026.3~rc1.so \
libc.so.6 \
libstdc++.so.6"

inherit rpm
