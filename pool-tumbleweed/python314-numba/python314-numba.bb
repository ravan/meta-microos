SUMMARY = "NumPy-aware optimizing compiler for Python using LLVM"
DESCRIPTION = "Numba is a NumPy-aware optimizing compiler for Python. It uses the \
LLVM compiler infrastructure to compile Python syntax to \
machine code. \
 \
It is aware of NumPy arrays as typed memory regions and so can speed-up \
code using NumPy arrays.  Other, less well-typed code will be translated \
to Python C-API calls, effectively removing the 'interpreter', but not removing \
the dynamic indirection. \
 \
Numba is also not a tracing JIT.  It *compiles* your code before it gets \
run, either using run-time type information or type information you provide \
in the decorator. \
 \
Numba is a mechanism for producing machine code from Python syntax and typed \
data structures such as those that exist in NumPy."
LICENSE = "BSD-2-Clause"

PV = "0.67.0"

RPM_NAME = "python314-numba-0.67.0-1.1.aarch64.rpm"
RPM_HASH = "958f920213491c737245918dc52206b6bc765feaa8fa4c231a089e4b8d7521e2e8e66203797c54bca7d8b81538f00716f1b457bf7db63de6397e375c673135e3"

RPROVIDES:${PN} += "python3.14dist-numba \
python314-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python314-llvmlite >= 0.49 with python314-llvmlite < 0.50 \
-python314-numpy >= 2.0 with python314-numpy < 2.6 \
/usr/bin/python3.14 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtbb.so.12 \
python-abi \
update-alternatives"

inherit rpm
