SUMMARY = "TCL grammar for tree-sitter"
DESCRIPTION = "TCL grammar for tree-sitter."
LICENSE = "MIT"

PV = "0+20250514.8f11ac7"

RPM_NAME = "tree-sitter-tcl-0+20250514.8f11ac7-1.3.aarch64.rpm"
RPM_HASH = "92c1c0c699f99ec9e0dd2a9b686ee3ff133982a239d9096c2ba56ec084e6351d154ac8c0c4c59d5634bf5b5485c1d833dba362b8b8ff6bbab21554ec67740767"

RPROVIDES:${PN} += "libtree-sitter-tcl.so \
tree-sitter-tcl \
treesitter-grammar-tree-sitter-tcl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
