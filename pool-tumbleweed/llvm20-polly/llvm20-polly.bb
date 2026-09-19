SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-polly-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "23834e35b2b95bad67b58f860dfaa3f09ff0bd949175d5c587ffa23c4b69de571ff515218c058b6306e599ab230e717430918f83956826f2be2ff8ddb994690a"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm20-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
