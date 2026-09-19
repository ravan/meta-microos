SUMMARY = "Chatito grammar for tree-sitter"
DESCRIPTION = "Chatito grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "tree-sitter-chatito-0.5.0-2.4.aarch64.rpm"
RPM_HASH = "3ee9d20b040fae3edeefc83c36f2189c5a5380cf88e13df3aa451e958a6225a5e1228a98f060ce819faecf953a37bc433d338d5dca78314bbc70b01399ccad74"

RPROVIDES:${PN} += "libtree-sitter-chatito.so \
tree-sitter-chatito \
treesitter-grammar-tree-sitter-chatito"

RDEPENDS:${PN} += ""

inherit rpm
