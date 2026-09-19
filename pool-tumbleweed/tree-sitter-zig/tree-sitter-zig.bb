SUMMARY = "Zig grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-zig grammar."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "tree-sitter-zig-1.1.2-3.1.aarch64.rpm"
RPM_HASH = "e3a904584829fea194653af13007cb16b05b6b348d0592dbffea4f0ada48bcd19ac40c23e3e2b805968dba13df3dd8958836f09d482974768362aabc6d8d8817"

RPROVIDES:${PN} += "libtree-sitter-zig.so \
tree-sitter-zig \
treesitter-grammar-tree-sitter-zig"

RDEPENDS:${PN} += ""

inherit rpm
