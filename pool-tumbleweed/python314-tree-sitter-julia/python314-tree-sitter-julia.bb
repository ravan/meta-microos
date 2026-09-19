SUMMARY = "Python binding for the julia tree-sitter grammar"
DESCRIPTION = "Pure-Python module tree_sitter_julia that loads the grammar library \
shipped in tree-sitter-julia and exposes it to python-tree-sitter via language()."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "python314-tree-sitter-julia-0.23.1-1.1.aarch64.rpm"
RPM_HASH = "a94061c412270550833e75783250c2f598ea05283b4edb27331edc8ce1f1fdd087e8935b431c10b89b69b64920a5a4e0eba97040f9fe1095b3db763233a0c9e3"

RPROVIDES:${PN} += "python314-tree-sitter-julia"

RDEPENDS:${PN} += "python-abi \
tree-sitter-julia"

inherit rpm
