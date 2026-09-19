SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-polly-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "0d06a1b08acf47a7bfb5adf682f4f5186641bc66823f0a928ccd0bc0178b60a00321ccff1a86cffef9d5b7c9ec14f556fddc3bbe44ace5ce998f741b3c5f1304"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm23-polly"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
