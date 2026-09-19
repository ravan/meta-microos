SUMMARY = "Ungrammar grammar for tree-sitter"
DESCRIPTION = "Ungrammar grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20230227.debd26f"

RPM_NAME = "tree-sitter-ungrammar-0+20230227.debd26f-2.4.aarch64.rpm"
RPM_HASH = "960c587a6ed75e60470208e9726ffd6c79390fc0821bc29b88159aa8bd8e92a22885ba3713eae33bd1d4758a82938dfdc3baf2169d44b2dca3aac7aa83915f81"

RPROVIDES:${PN} += "libtree-sitter-ungrammar.so \
tree-sitter-ungrammar \
treesitter-grammar-tree-sitter-ungrammar"

RDEPENDS:${PN} += ""

inherit rpm
