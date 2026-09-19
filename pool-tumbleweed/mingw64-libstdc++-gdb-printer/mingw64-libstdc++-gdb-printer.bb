SUMMARY = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
DESCRIPTION = "MinGW Windows compiler for C++ gdb pretty printer for libstdc++"
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0"

RPM_NAME = "mingw64-libstdc++-gdb-printer-16.2.0-1.1.noarch.rpm"
RPM_HASH = "53d0ddcace95567ea779d5ea8b6bec78bd803666f0f9a08c58144f159d50f76d7cc24fdc6b5c118c7abe7a9af2646f5a47e0dfc03c9634e7c703e68fe43a5386"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-libstdc++-gdb-printer"

RDEPENDS:${PN} += ""

inherit rpm
