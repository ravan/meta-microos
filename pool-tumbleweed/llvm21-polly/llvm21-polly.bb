SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-polly-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "e5bade29ec03de95f97ede085cf87d86a27b72511be5c6fffb72b56741083495ef5369afe78f84241cffff92be19bb6acb775b3562adab7f1b77689c1c484ab2"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm21-polly"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
