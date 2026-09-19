SUMMARY = "Lua patterns grammar for tree-sitter"
DESCRIPTION = "Lua patterns grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "tree-sitter-luap-1.0.1-2.4.aarch64.rpm"
RPM_HASH = "4609842d4c49c4d4da38ef92dee2918fafcf5d275666527a4ac0e1a864d65e77f49f8ff6e66c7749eb9c5be609738e7cafbd1bc799a83b5974cbbf114059d4d4"

RPROVIDES:${PN} += "libtree-sitter-luap.so \
tree-sitter-luap \
treesitter-grammar-tree-sitter-luap"

RDEPENDS:${PN} += ""

inherit rpm
