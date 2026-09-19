SUMMARY = "Tools for visualising the LLVM optimization records"
DESCRIPTION = "Set of tools for visualising the LLVM optimization records generated with -fsave-optimization-record. Used for compiler-assisted performance analysis."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-opt-viewer-21.1.8-9.2.noarch.rpm"
RPM_HASH = "0a4cdf369c29571c9d3365c4a5ba53f790bd1745786d1d4d483e4b9f66106279cf2b7d60b8d49fb71ed2b17edf66d9082de19caba43512861403c974a3187db6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "llvm21-opt-viewer \
opt-viewer"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-Pygments"

inherit rpm
