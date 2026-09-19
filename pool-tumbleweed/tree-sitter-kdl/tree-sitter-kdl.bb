SUMMARY = "KDL grammar for tree-sitter"
DESCRIPTION = "KDL grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-kdl-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "5f77c7f9a904dc7f647cdc355794ab8ffa920e4b50cdeacc08be9cc4eb4b9038781d5cd51be6eb7def1ddfe6c44c5a0346ff1351407e93b3a379e5e9158fe3b9"

RPROVIDES:${PN} += "libtree-sitter-kdl.so \
tree-sitter-kdl \
treesitter-grammar-tree-sitter-kdl"

RDEPENDS:${PN} += ""

inherit rpm
