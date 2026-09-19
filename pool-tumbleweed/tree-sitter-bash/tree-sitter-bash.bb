SUMMARY = "Bash grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-bash grammar."
LICENSE = "MIT"

PV = "0.25.1"

RPM_NAME = "tree-sitter-bash-0.25.1-3.1.aarch64.rpm"
RPM_HASH = "4397f91dd31cc8d554f8e960a1226af2f79bebb6bbce94c57dbfd83504755a8ebd4306e444540fa1f1b9947e67dc83a9d08f9fd36810db07049048bb84166a8c"

RPROVIDES:${PN} += "libtree-sitter-bash.so \
tree-sitter-bash \
treesitter-grammar-tree-sitter-bash"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
