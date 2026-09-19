SUMMARY = "Lightweight wrapper around basic LLVM functionality"
DESCRIPTION = "A lightweight LLVM python binding for writing JIT compilers \
 \
The old llvmpy  binding exposes a lot of LLVM APIs but the mapping of \
C++-style memory management to Python is error prone. Numba_ and many JIT \
compilers do not need a full LLVM API.  Only the IR builder, optimizer, \
and JIT compiler APIs are necessary. \
 \
llvmlite is a project originally tailored for Numba's needs, using the \
following approach: \
 \
* A small C wrapper around the parts of the LLVM C++ API we need that are \
  not already exposed by the LLVM C API. \
* A ctypes Python wrapper around the C API. \
* A pure Python implementation of the subset of the LLVM IR builder that we \
  need for Numba."
LICENSE = "BSD-2-Clause"

PV = "0.49.0"

RPM_NAME = "python314-llvmlite-0.49.0-1.1.aarch64.rpm"
RPM_HASH = "a42f6ff5b8ac57587a9e42537ac34c7f228d6b0839ac082b041adb81830f1ac5138c98a7a1f6762a22344af5fd07fa1db5b5af4bc6ff36d9bea1c57c20c23261"

RPROVIDES:${PN} += "libllvmlite.so \
python3.14dist-llvmlite \
python314-llvmlite \
python3dist-llvmlite"

RDEPENDS:${PN} += "libLLVM.so.22.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
