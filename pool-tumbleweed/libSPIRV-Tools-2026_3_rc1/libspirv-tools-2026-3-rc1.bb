SUMMARY = "SPIR-V tool component library"
DESCRIPTION = "The SPIR-V Tool library contains all of the implementation details \
driving the SPIR-V assembler, binary module parser, disassembler and \
validator, and is used in the standalone tools whilst also enabling \
integration into other code bases directly."
LICENSE = "Apache-2.0"

PV = "2026.3~rc1"

RPM_NAME = "libSPIRV-Tools-2026_3_rc1-2026.3~rc1-1.2.aarch64.rpm"
RPM_HASH = "1a57b8d397fdc922bfd1c0830d36cd31b75014158e7d4c587eb6a8ec1af0f628ae69dcb72bae0b81cca4041ea9318146876a469f6842b20a6829e009de82fe2c"

RPROVIDES:${PN} += "libSPIRV-Tools-2026-3-rc1 \
libSPIRV-Tools-2026.3~rc1.so \
libSPIRV-Tools-diff-2026.3~rc1.so \
libSPIRV-Tools-link-2026.3~rc1.so \
libSPIRV-Tools-lint-2026.3~rc1.so \
libSPIRV-Tools-opt-2026.3~rc1.so \
libSPIRV-Tools-reduce-2026.3~rc1.so \
libSPIRV-Tools-shared-2026.3~rc1.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
