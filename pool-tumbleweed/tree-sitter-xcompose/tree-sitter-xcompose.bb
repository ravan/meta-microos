SUMMARY = "XCompose grammar for tree-sitter"
DESCRIPTION = "XCompose grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-xcompose-0.3.0-2.4.aarch64.rpm"
RPM_HASH = "f47b3bf59fd3d56a19b31af4a5dee41c09e6c2adf8a4536ba5bca503c33b73d0a870cd2afaecd1de48de6ab1f0e3ea67f5969d71849c43c01e9e75919f5f6393"

RPROVIDES:${PN} += "libtree-sitter-xcompose.so \
tree-sitter-xcompose \
treesitter-grammar-tree-sitter-xcompose"

RDEPENDS:${PN} += ""

inherit rpm
