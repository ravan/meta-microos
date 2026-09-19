SUMMARY = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
DESCRIPTION = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw32-libstdc++-gdb-printer-16.2.0-1.1.noarch.rpm"
RPM_HASH = "1fb1c5c5ee4d88d748b99501f40ee3db4757a68b8af316b8fd45d7a8457634226a99af0c061e3ae2023feb4e7d3d1d888a87f1fb4a14b6910795d5530a381489"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-libstdc++-gdb-printer"

RDEPENDS:${PN} += ""

inherit rpm
