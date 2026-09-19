SUMMARY = "Software debugger built using LLVM libraries"
DESCRIPTION = "LLDB is a next generation, high-performance debugger. It is built as a set \
of reusable components which highly leverage existing libraries in the \
larger LLVM Project, such as the Clang expression parser and LLVM \
disassembler. \
 \
This package is a dummy package that depends on the version of \
lldb that openSUSE currently supports.  Packages that \
don't require a specific LLDB version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "lldb-23-1.1.aarch64.rpm"
RPM_HASH = "9c7b94356323ebd32a6b726f60306944de6e8cd3820c7a5c1563cffcb8d8250816d66e79e29ea5c46acec344866d3d4e3fc228bf3ada5056699b8730d5c7290e"

RPROVIDES:${PN} += "lldb"

RDEPENDS:${PN} += "lldb23"

inherit rpm
