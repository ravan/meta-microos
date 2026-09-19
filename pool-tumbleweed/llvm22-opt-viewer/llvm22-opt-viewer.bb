SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-opt-viewer-22.1.8-3.2.noarch.rpm"
RPM_HASH = "800329d585a76f1f2479d26d6362b8324742284333e876bcb46f196432afaefceef6fa97e3b660b77d78b41fe92d122665402c7f9e0b05b9431e4c22927655df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm22-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
