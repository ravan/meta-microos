SUMMARY = "FunC grammar for tree-sitter"
DESCRIPTION = "FunC grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-func-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "da02d3345c8158f1c7bf6d7896b42c78d4a402f34c126a4924895d3c9b653a0dbc88293a3374a1df1361805d52213c2e129ce9ffb584c8a29f92e5004e7fdcec"

RPROVIDES:${PN} += "libtree-sitter-func.so \
tree-sitter-func \
treesitter-grammar-tree-sitter-func"

RDEPENDS:${PN} += ""

inherit rpm
