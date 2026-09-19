SUMMARY = "DWARF utilities"
DESCRIPTION = "dwarves is a set of tools that use the DWARF debugging information \
inserted in ELF binaries by compilers such as GCC, used by well known \
debuggers such as GDB, and more recent ones such as systemtap. \
 \
Utilities in the dwarves suite include pahole, that can be used to \
find alignment holes in structs and classes in languages such as C, \
C++, but not limited to these. \
 \
It also extracts other information such as CPU cacheline alignment, \
helping pack those structures to achieve more cache hits. \
 \
A diff like tool, codiff can be used to compare the effects changes \
in source code generate on the resulting binaries. \
 \
Another tool is pfunct, that can be used to find all sorts of \
information about functions, inlines, decisions made by the compiler \
about inlining, etc."
LICENSE = "GPL-2.0-only"

PV = "1.31"

RPM_NAME = "dwarves-1.31-1.5.aarch64.rpm"
RPM_HASH = "5ef537af2a3492117e1119bb64d86c288ac40650d76ad7a1f91e414492217f389fd53a581d1947c573f85898d95398a557ca9b7f0176bbc618bf98bb32df30d2"

RPROVIDES:${PN} += "dwarves \
pahole"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libdwarves-emit.so.1 \
libdwarves-reorganize.so.1 \
libdwarves.so.1 \
libelf.so.1"

inherit rpm
