SUMMARY = "Documentation for LLVM"
DESCRIPTION = "This package contains documentation for the LLVM infrastructure. \
 \
This package is a dummy package that depends on the version of \
llvm-doc that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-doc-23-1.1.aarch64.rpm"
RPM_HASH = "b7b1ac7faad6fbadbf3efb208a0ef17e5983999e08ddc5b260fc53c7e4bf777603feadd2042cd1b4f5bfe37522fe98ab4d5545ad8304fe6a37911a7c59bd5a08"

RPROVIDES:${PN} += "llvm-doc"

RDEPENDS:${PN} += "llvm \
llvm23-doc"

inherit rpm
