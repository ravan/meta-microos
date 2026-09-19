SUMMARY = "Tree-sitter parser for Vim help files"
DESCRIPTION = "Tree-sitter parser for Vim help files."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "tree-sitter-vimdoc-4.1.0-2.4.aarch64.rpm"
RPM_HASH = "918bc84b4bd6bb9901d5e5b3abcac0a0cd5a162b6a449281f044c55f5eaca629abb27be06ce447f345ac89d0d11b8bb47ef024c68f60e2e27bf43f74a3873191"

RPROVIDES:${PN} += "libtree-sitter-vimdoc.so \
tree-sitter-vimdoc \
treesitter-grammar-tree-sitter-vimdoc"

RDEPENDS:${PN} += ""

inherit rpm
