SUMMARY = "Netwide Assembler (An x86 Assembler)"
DESCRIPTION = "NASM is a prototype general-purpose x86 assembler. It can currently output \
several binary formats, including ELF, a.out, Win32, and OS/2."
LICENSE = "BSD-2-Clause"

PV = "3.02"

RPM_NAME = "nasm-3.02-1.2.aarch64.rpm"
RPM_HASH = "2dd5bb41c3f7fdc6dd4dfa54b109f3615129f6f4c4d7cb8eff46f138a4dc103972f1e7b7aa3db6c3c028bbc66f889f13a381e764256617d00537f90ebf276401"

RPROVIDES:${PN} += "nasm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
