SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities. \
 \
This package is a dummy package that depends on the version of \
llvm-polly that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-polly-23-1.1.aarch64.rpm"
RPM_HASH = "40c8fc571aca5d623acfcb9e3b0500cfd4c9c4f9c856cff0185a92cc67d72a2b4cc6b28bf37d398acd2581de9218408dfb50360c8db905f540c48061e5283b77"

RPROVIDES:${PN} += "llvm-polly"

RDEPENDS:${PN} += "llvm23-polly"

inherit rpm
