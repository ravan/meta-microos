SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated \
with -fsave-optimization-record. Used for compiler-assisted performance \
analysis. \
 \
This package is a dummy package that depends on the version of \
llvm-opt-viewer that openSUSE currently supports.  Packages that \
don't require a specific LLVM version should depend on this."
LICENSE = "Apache-2.0-with-LLVM-exception | NCSA"

PV = "23"

RPM_NAME = "llvm-opt-viewer-23-1.1.noarch.rpm"
RPM_HASH = "719290c674a7df0fc6d46d5997bd3e0712837fc33209d3673587c397df6f55bae42d90d4cf4e03322494cf7c2ad66b21d47cde5f3a9892b16bca0f4b8b72269e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm-opt-viewer"

RDEPENDS:${PN} += "llvm23-opt-viewer"

inherit rpm
