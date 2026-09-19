SUMMARY = "Compiler for the Zig language"
DESCRIPTION = "General-purpose programming language and toolchain for maintaining robust, optimal, and reusable software. \
 \
* Robust - behavior is correct even for edge cases such as out of memory. \
* Optimal - write programs the best way they can behave and perform. \
* Reusable - the same code works in many environments which have different constraints. \
* Maintainable - precisely communicate intent to the compiler and other programmers. \
The language imposes a low overhead to reading code and is resilient to changing requirements and environments."
LICENSE = "MIT"

PV = "0.15.2"

RPM_NAME = "zig0.15-0.15.2-3.1.aarch64.rpm"
RPM_HASH = "b1a0821f1c4d934260f9b4104be5dffcea493b14fa180078b2f1280d63409b2e3801fdeddbeae9bd8f1a35b4c7414eb191aa43c62b12b5245f39bfcf31378b98"

RPROVIDES:${PN} += "zig \
zig-implementation \
zig0.15"

RDEPENDS:${PN} += "libLLVM.so.20.1 \
libc.so.6 \
libclang-cpp.so.20.1 \
libstdc++.so.6 \
lld20 \
zig-libs0.15"

inherit rpm
