SUMMARY = "Julia grammar for tree-sitter"
DESCRIPTION = "Python binding for the julia tree-sitter grammar."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-julia-0.23.1-1.1.aarch64.rpm"
RPM_HASH = "f0acef586409af1bb05ee52d48ad52379fe55df1d17d56c3986cccb31f28e2412ca582164702d471a9595c90d9cb07ac6fdb37901d9e614ecf70439f552f3ed8"

RPROVIDES:${PN} += "libtree-sitter-julia.so \
tree-sitter-julia \
treesitter-grammar-tree-sitter-julia"

RDEPENDS:${PN} += ""

inherit rpm
