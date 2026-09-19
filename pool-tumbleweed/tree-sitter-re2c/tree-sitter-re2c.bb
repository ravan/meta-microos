SUMMARY = "Re2c grammar for tree-sitter"
DESCRIPTION = "Re2c grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20240925.c18a3c2"

RPM_NAME = "tree-sitter-re2c-0+20240925.c18a3c2-2.4.aarch64.rpm"
RPM_HASH = "d9aa0bd6fa8eacb577b009cee9ed4d33a9f0a18ad611349bbf0be58342e0931c3e1c0ef96bfe4cae67fa450e1c6bec4321cbc6bae7ff6d9cdb34796e275190d3"

RPROVIDES:${PN} += "libtree-sitter-re2c.so \
tree-sitter-re2c \
treesitter-grammar-tree-sitter-re2c"

RDEPENDS:${PN} += ""

inherit rpm
