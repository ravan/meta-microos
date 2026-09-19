SUMMARY = "Deep ghidra decompiler integration for rizin and rz-cutter"
DESCRIPTION = "rz-ghidra is an integration of the Ghidra decompiler and Sleigh Disassembler for Rizin. \
It is solely based on the decompiler part of Ghidra, which is written entirely in C++, \
so Ghidra itself is not required at all and the plugin can be built self-contained"
LICENSE = "LGPL-3.0-only"

PV = "0.9.0"

RPM_NAME = "rz-ghidra-0.9.0-1.1.aarch64.rpm"
RPM_HASH = "d7896ed13d79496701de19c9645b992676a4a3a7c0c982ec923736f7a9c93c0a5b627a99683849591318003a6e06db5a5d4c0b0e429bddf31f8b1bb20bfa80c0"

RPROVIDES:${PN} += "librz-ghidra-cutter.so \
rz-ghidra"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librz-arch.so.0.9 \
librz-bin.so.0.9 \
librz-config.so.0.9 \
librz-cons.so.0.9 \
librz-core.so.0.9 \
librz-flag.so.0.9 \
librz-io.so.0.9 \
librz-reg.so.0.9 \
librz-type.so.0.9 \
librz-util.so.0.9 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
