SUMMARY = "Rust grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-rust grammar."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "tree-sitter-rust-0.24.0-3.1.aarch64.rpm"
RPM_HASH = "619375942a9e039732a5db1471d9717b9bd9659e17c4c4ce60ff8b58c1f14063b0b9d002562685e654fd9fc8edb629ffcea99692a3a1d447976a1ae149488393"

RPROVIDES:${PN} += "libtree-sitter-rust.so \
tree-sitter-rust \
treesitter-grammar-tree-sitter-rust"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
