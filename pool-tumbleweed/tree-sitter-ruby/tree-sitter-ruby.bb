SUMMARY = "Ruby grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-ruby grammar."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-ruby-0.23.1-5.1.aarch64.rpm"
RPM_HASH = "febda1d70322afc8077542ba82322689d2234bdd3df4b913b197c1d9f717c9d405c96ba0b456171f580eab12da87a4143bf8acadf4d5c16893b5ab2f9adf86d5"

RPROVIDES:${PN} += "libtree-sitter-ruby.so \
tree-sitter-ruby \
treesitter-grammar-tree-sitter-ruby"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
