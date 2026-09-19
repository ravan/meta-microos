SUMMARY = "Haskell grammar for tree-sitter"
DESCRIPTION = "Haskell grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-haskell-0.23.1-2.5.aarch64.rpm"
RPM_HASH = "f208e1776fdd5b61044fad8e0006bbb7fdd055bbd403c76f996ef7a8abe1c3ea247b41f4756b3b981a6c4dfe70c6c16d18cff4ffdf92b125124315aa2f7b9b50"

RPROVIDES:${PN} += "libtree-sitter-haskell.so \
tree-sitter-haskell \
treesitter-grammar-tree-sitter-haskell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
