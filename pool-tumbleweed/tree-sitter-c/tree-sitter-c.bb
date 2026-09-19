SUMMARY = "C grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-c grammar."
LICENSE = "MIT"

PV = "0.24.1"

RPM_NAME = "tree-sitter-c-0.24.1-3.1.aarch64.rpm"
RPM_HASH = "2a2c38760b9803e4e3a3c1caf42b3bc7fd3816b1db9f01b9926437a532f7c5a498fe5f70d55fb11f2e7d1f26a04804d895be62b5db24b4bd73bdaf7ed436bb13"

RPROVIDES:${PN} += "libtree-sitter-c.so \
tree-sitter-c \
treesitter-grammar-tree-sitter-c"

RDEPENDS:${PN} += ""

inherit rpm
