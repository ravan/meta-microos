SUMMARY = "DWARF processing libraries of dwarves tools"
DESCRIPTION = "This package contains the libdwarves shared library for the dwarves \
toolset, providing processing for DWARF, a debugging data format \
for ELF files. \
 \
dwarves is a set of tools that use the DWARF debugging information \
inserted in ELF binaries by compilers such as GCC, used by well known \
debuggers such as GDB, and more recent ones such as systemtap."
LICENSE = "GPL-2.0-only"

PV = "1.31"

RPM_NAME = "libdwarves1-1.31-1.5.aarch64.rpm"
RPM_HASH = "d2ab537f5b6ad164f3e0a5a537c8a7e7b1db28da4f4ab4f61e93733ed9aa1784b6ef3172e8e8b59f783ec7c6fe65d5ddfb8e4a996d8fbd96f1833cd40c7c7f3f"

RPROVIDES:${PN} += "libdwarves-emit.so.1 \
libdwarves-reorganize.so.1 \
libdwarves.so.1 \
libdwarves1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbpf.so.1 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libz.so.1"

inherit rpm
