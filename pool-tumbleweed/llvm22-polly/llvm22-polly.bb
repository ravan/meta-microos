SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-polly-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "75d23ad435763935ba53389ad9c2a175bf18922712884caf0471e8dfc5a03c509cb4998ff228646005ced11f3bbc5d81f56e20920a9caa14339b06637f5035ff"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm22-polly"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
