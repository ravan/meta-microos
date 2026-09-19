SUMMARY = "PO grammar for tree-sitter"
DESCRIPTION = "PO grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20240420.bd860a0"

RPM_NAME = "tree-sitter-po-0+20240420.bd860a0-2.4.aarch64.rpm"
RPM_HASH = "a4413217cbba53e8b7fb43a37991437a8c0ecfad3981a73c58255d9b7a12f34a881f2364000ed25c41084745a62dd69e82615f7b9393f9dd669f7bd753cf5329"

RPROVIDES:${PN} += "libtree-sitter-po.so \
tree-sitter-po \
treesitter-grammar-tree-sitter-po"

RDEPENDS:${PN} += ""

inherit rpm
