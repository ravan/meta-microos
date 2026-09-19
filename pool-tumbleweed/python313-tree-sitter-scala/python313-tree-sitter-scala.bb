SUMMARY = "Python binding for the scala tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_scala that loads the grammar library \
shipped in tree-sitter-scala and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.26.0"

RPM_NAME = "python313-tree-sitter-scala-0.26.0-1.1.aarch64.rpm"
RPM_HASH = "4e4785ffcbf39951172f0aec4ed37557407f003f136896eaf656442ec4a1ff8819827718c48dbd6e36a2e25e10fa4a856606a9873b45c369b83a9c26e0b0befc"

RPROVIDES:${PN} += "python3-tree-sitter-scala \
python313-tree-sitter-scala"

RDEPENDS:${PN} += "python-abi \
tree-sitter-scala"

inherit rpm
