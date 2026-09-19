SUMMARY = "Python binding for the fortran tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_fortran that loads the grammar library \
shipped in tree-sitter-fortran and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python313-tree-sitter-fortran-0.6.0-1.1.aarch64.rpm"
RPM_HASH = "a61001a9263cc71679f4a37bfc996a5a68fe8203d3f02ed63083c62753420c5002afddd82e14cb442d9c017b2c50d7abbd1a768ad953e18e0bb2c622b960cb3a"

RPROVIDES:${PN} += "python3-tree-sitter-fortran \
python313-tree-sitter-fortran"

RDEPENDS:${PN} += "python-abi \
tree-sitter-fortran"

inherit rpm
