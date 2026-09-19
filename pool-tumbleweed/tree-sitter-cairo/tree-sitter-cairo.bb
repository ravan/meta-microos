SUMMARY = "Cairo grammar for tree-sitter"
DESCRIPTION = "Cairo grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-cairo-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "c5e160dddfe9e04def89e0711529329521a8bf9c0d8997b089136e0f278e28052d3460ce71b5e02a03d0009327bfdaa76f75f78a1622b70f65e8bf320439451c"

RPROVIDES:${PN} += "libtree-sitter-cairo.so \
tree-sitter-cairo \
treesitter-grammar-tree-sitter-cairo"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
