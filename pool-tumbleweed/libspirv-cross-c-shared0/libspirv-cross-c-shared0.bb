SUMMARY = "Library for SPIR-V reflection and disassembly"
DESCRIPTION = "SPIRV-Cross is a tool and library designed for parsing and \
converting SPIR-V to other shader languages."
LICENSE = "Apache-2.0 | MIT"

PV = "1.4.313.0"

RPM_NAME = "libspirv-cross-c-shared0-1.4.313.0-1.5.aarch64.rpm"
RPM_HASH = "d3b231f669b3dfbcd30f850d5f609c14805cd09ccdb64bc60d1fa3dcc540fb02b0ec2a09d9f3fa997f8bad8c48a174eea94bea7b8ea068b99b2ca8c4c0e116d4"

RPROVIDES:${PN} += "libspirv-cross-c-shared.so.0 \
libspirv-cross-c-shared0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
