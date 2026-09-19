SUMMARY = "Compiler for the Zig language"
DESCRIPTION = "General-purpose programming language and toolchain for maintaining robust, optimal, and reusable software. \
 \
* Robust - behavior is correct even for edge cases such as out of memory. \
* Optimal - write programs the best way they can behave and perform. \
* Reusable - the same code works in many environments which have different constraints. \
* Maintainable - precisely communicate intent to the compiler and other programmers. \
The language imposes a low overhead to reading code and is resilient to changing requirements and environments."
LICENSE = "MIT"

PV = "0.16.0"

RPM_NAME = "zig0.16-0.16.0-2.1.aarch64.rpm"
RPM_HASH = "d024f6a49415f84bc3a2fc08d1fa0036e02cce79b0b70b7753fadb917d0c3154f14eccc30e83412fa2a2883f750ce9202b5cb28ad2386346ee7b5abda2c89edd"

RPROVIDES:${PN} += "zig \
zig-implementation \
zig0.16"

RDEPENDS:${PN} += "libLLVM.so.21.1 \
libc.so.6 \
libclang-cpp.so.21.1 \
libstdc++.so.6 \
lld21 \
zig-libs0.16"

inherit rpm
