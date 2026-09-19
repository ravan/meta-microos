SUMMARY = "QML grammar for tree-sitter"
DESCRIPTION = "QML grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-qmljs-0.3.0-1.3.aarch64.rpm"
RPM_HASH = "248dabc8922b0ee5d30435eb2716b0b8d7676679dfb4833afbcb46fbe134e8cdb07c3a7abbd07d3ecb4847116822b38443341fa810958f99952b054ad0809256"

RPROVIDES:${PN} += "libtree-sitter-qmljs.so \
tree-sitter-qmljs \
treesitter-grammar-tree-sitter-qmljs"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
