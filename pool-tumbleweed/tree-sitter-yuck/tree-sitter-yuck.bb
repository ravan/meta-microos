SUMMARY = "Eww grammar for tree-sitter"
DESCRIPTION = "Eww grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.0.2"

RPM_NAME = "tree-sitter-yuck-0.0.2-2.4.aarch64.rpm"
RPM_HASH = "29db2572821be9abbe6339e83a2d940081d1821dde32267814ab007ad399547cd627c7b499cbdc396b139809f2d3c31ee28f7ea3a3c66a587355cd10ca77e33c"

RPROVIDES:${PN} += "libtree-sitter-yuck.so \
tree-sitter-yuck \
treesitter-grammar-tree-sitter-yuck"

RDEPENDS:${PN} += ""

inherit rpm
