SUMMARY = "PHP grammar for tree-sitter"
DESCRIPTION = "Python binding for the php tree-sitter grammar."
LICENSE = "MIT"

PV = "0.23.9"

RPM_NAME = "tree-sitter-php-0.23.9-1.1.aarch64.rpm"
RPM_HASH = "6752b7f1db0b1d7be376e297e702aa37b88679f26742ce3742489a3ea366a04116f918aadf66f0740e217d0ea3a5cfea31f77bcf2bfe6e78b91fc90c319e8bd0"

RPROVIDES:${PN} += "libtree-sitter-php-only.so \
libtree-sitter-php.so \
tree-sitter-php \
treesitter-grammar-tree-sitter-php \
treesitter-grammar-tree-sitter-php-only"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
