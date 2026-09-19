SUMMARY = "Go.sum grammar for tree-sitter"
DESCRIPTION = "Go.sum grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-go-sum-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "8c32bf4903c80efbb83e1238f69153ad72119b3b158f9393a0ee33192c76d54f8ed865f12e248e5e0343afb566b098b67720fb006eda0048bb58da3ecaa07fc9"

RPROVIDES:${PN} += "libtree-sitter-go-sum.so \
tree-sitter-go-sum \
treesitter-grammar-tree-sitter-go-sum"

RDEPENDS:${PN} += ""

inherit rpm
