SUMMARY = "Lua grammar for tree-sitter"
DESCRIPTION = "Lua grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.24.7.1"

RPM_NAME = "tree-sitter-scheme-0.24.7.1-1.3.aarch64.rpm"
RPM_HASH = "eea491217ddddbfb5d8926909a2000dad8298f4b2a6881c2335ad71b86ecda59e9b72d0e610d89eba67ab4c3dfc000ca8bed3418ecef91943da7bc122a9b6354"

RPROVIDES:${PN} += "libtree-sitter-scheme.so \
tree-sitter-scheme \
treesitter-grammar-tree-sitter-scheme"

RDEPENDS:${PN} += ""

inherit rpm
