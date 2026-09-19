SUMMARY = "CLI CPU information tool written in C"
DESCRIPTION = "cpufetch is a command-line tool written in C that displays the CPU information \
in a clean and beautiful way."
LICENSE = "GPL-2.0-only"

PV = "1.07"

RPM_NAME = "cpufetch-1.07-1.3.aarch64.rpm"
RPM_HASH = "a7a88e4f34de7e0ab1869a3695b749d0cb8d24b27c1d0837f7b73451ee7462a51f3cead337eefb40a843e1eebc775c5886adb6d40452d0c183d9773dfc24fd10"

RPROVIDES:${PN} += "cpufetch"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
