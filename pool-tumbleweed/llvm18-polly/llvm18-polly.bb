SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-polly-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "d72eeda07ec434883475238e2218fae45f1b109be1f1a06acc27dc0a5681e5daf406f15702e6add0d23063148a5740fe2f13d4a021e9af3b69ff786499578729"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm18-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
