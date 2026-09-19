SUMMARY = "Readline grammar for tree-sitter"
DESCRIPTION = "Readline grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "tree-sitter-readline-1.1.1-2.4.aarch64.rpm"
RPM_HASH = "2b10d18e4222141e7fe324f219e049737a13b0b5e68859dd29710f9b05b239258468896f59d8fe5fcc9f1b499e9c88cb962a2283eb23e5d04a17a97e3af4f967"

RPROVIDES:${PN} += "libtree-sitter-readline.so \
tree-sitter-readline \
treesitter-grammar-tree-sitter-readline"

RDEPENDS:${PN} += ""

inherit rpm
