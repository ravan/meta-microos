SUMMARY = "LLVM Framework for High-Level Loop and Data-Locality Optimizations"
DESCRIPTION = "Polly is a high-level loop and data-locality optimizer and optimization \
infrastructure for LLVM. It uses an abstract mathematical representation based \
on integer polyhedra to analyze and optimize the memory access pattern of a \
program. Polly can currently perform classical loop transformations, especially \
tiling and loop fusion to improve data-locality. It can also exploit OpenMP \
level parallelism and expose SIMDization opportunities."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-polly-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "e1342f1805344f764d9b7e458e66d45b580bd9611751a157bd1e83c3441ab2bf3b750c37138854efac93f49e5a36a8fdb5ab92d0d20db6f8081fc4977ad8a497"

RPROVIDES:${PN} += "llvm-polly-provider \
llvm19-polly"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
