SUMMARY = "Compiler for the Zig language"
DESCRIPTION = "General-purpose programming language and toolchain for maintaining robust, optimal, and reusable software. \
 \
* Robust - behavior is correct even for edge cases such as out of memory. \
* Optimal - write programs the best way they can behave and perform. \
* Reusable - the same code works in many environments which have different constraints. \
* Maintainable - precisely communicate intent to the compiler and other programmers. \
The language imposes a low overhead to reading code and is resilient to changing requirements and environments."
LICENSE = "MIT"

PV = "0.14.1"

RPM_NAME = "zig0.14-0.14.1-2.3.aarch64.rpm"
RPM_HASH = "0ab018375ca10ad5a4a1257ce2a8d1a5f6ca2bdd3922d3b4151458acb81516a9071c0077100392f58b5c85525f99583b5e8da789fb54f9360d51304b4d1ae7b8"

RPROVIDES:${PN} += "zig \
zig-implementation \
zig0.14"

RDEPENDS:${PN} += "libLLVM.so.19.1 \
libc.so.6 \
libclang-cpp.so.19.1 \
libstdc++.so.6 \
lld19 \
zig-libs0.14"

inherit rpm
