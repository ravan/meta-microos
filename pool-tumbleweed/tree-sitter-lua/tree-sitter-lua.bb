SUMMARY = "Lua grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-lua grammar."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-lua-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "753268eb8b4f8dbda9304850c491d581721b7721538a432d7457a2b9910555432e9ed66ada9705d2e4949400579b4fb5eaedd6e2c58d279c56e933a24db592a0"

RPROVIDES:${PN} += "libtree-sitter-lua.so \
tree-sitter-lua \
treesitter-grammar-tree-sitter-lua"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
