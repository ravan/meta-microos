SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-opt-viewer-20.1.8-8.2.noarch.rpm"
RPM_HASH = "a99574a6659cac196af1954fb94f61d5fcb84f5f6e7eff04554b54a07f2df393386e0e0ff7f9802d1194b25cd60a6cda68e1e84db0c4e2c84f3a30d17db330f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm20-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
