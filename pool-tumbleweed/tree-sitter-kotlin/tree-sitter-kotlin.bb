SUMMARY = "Kotlin grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-kotlin grammar."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-kotlin-1.1.0-3.1.aarch64.rpm"
RPM_HASH = "ea87ecff63ca0717b87482c9888903ca4bf69538b5b20e81a0a673805251df02c47a8fcc1c18be236c5388f7174fdd89d25900482e043c00799470b99520270c"

RPROVIDES:${PN} += "libtree-sitter-kotlin.so \
tree-sitter-kotlin \
treesitter-grammar-tree-sitter-kotlin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
