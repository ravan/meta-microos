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

RPM_NAME = "python313-numba-0.67.0-1.1.aarch64.rpm"
RPM_HASH = "a9f82a3e2a2e9e77d39623539f7df1af57c0ee163d56eb24e064b994293f3a7d93cf559044eaf88fbc7b877c7e00def406c1babcbcd2a9e1c2e4538726444b67"

RPROVIDES:${PN} += "python3-numba \
python3.13dist-numba \
python313-numba \
python3dist-numba"

RDEPENDS:${PN} += "-python313-llvmlite >= 0.49 with python313-llvmlite < 0.50 \
-python313-numpy >= 2.0 with python313-numpy < 2.6 \
/usr/bin/python3.13 \
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
