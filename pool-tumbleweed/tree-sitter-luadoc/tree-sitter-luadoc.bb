SUMMARY = "Lua docs grammar for tree-sitter"
DESCRIPTION = "Lua docs grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-luadoc-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "9a8829ac0f526d19fc1bcc762b12d0a9262d8a5e2094bdd6ceaa3e09678c5aa3122f9612c75d3ca0d41ab6b5f148953600bba420bfc042912f89e056c157c493"

RPROVIDES:${PN} += "libtree-sitter-luadoc.so \
tree-sitter-luadoc \
treesitter-grammar-tree-sitter-luadoc"

RDEPENDS:${PN} += ""

inherit rpm
