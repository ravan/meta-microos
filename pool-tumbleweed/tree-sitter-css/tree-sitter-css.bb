SUMMARY = "CSS grammar for tree-sitter"
DESCRIPTION = "CSS grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "tree-sitter-css-0.23.2-2.5.aarch64.rpm"
RPM_HASH = "a6853d0ef9813b2136644a618cefb2a4f5d56d1d9026cae643bedd5f874843bccf0bec3954e3aea90176ad2ea1edf902eacae1061e88364dd3f1964486e5f0f7"

RPROVIDES:${PN} += "libtree-sitter-css.so \
tree-sitter-css \
treesitter-grammar-tree-sitter-css"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
