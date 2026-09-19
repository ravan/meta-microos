SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-opt-viewer-23.1.1-1.1.noarch.rpm"
RPM_HASH = "5c0ce243fad3321fa3a0c8cb1ee0553510f6661c2a74713f09b72e1accf8a67578eee119e2897329034811c6acd5da1d0139f819535dd925d8af1466a876bfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm23-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
