SUMMARY = "Python binding for the julia tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_julia that loads the grammar library \
shipped in tree-sitter-julia and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python313-tree-sitter-julia-0.23.1-1.1.aarch64.rpm"
RPM_HASH = "785dd8e5f4e9fcb397acd3ca9b9feb92cd5f1b918948c7ac3137de07c851b3c28274320a34716646e63b226abd63f0eba1e055e4a340575e7afbf43112d66a27"

RPROVIDES:${PN} += "python3-tree-sitter-julia \
python313-tree-sitter-julia"

RDEPENDS:${PN} += "python-abi \
tree-sitter-julia"

inherit rpm
