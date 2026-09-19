SUMMARY = "Query grammar for tree-sitter"
DESCRIPTION = "Query grammar for tree-sitter."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "tree-sitter-query-0.8.0-2.4.aarch64.rpm"
RPM_HASH = "225c63093aa94af8ada3bd34a088699604abeea537579dbbb97883846b78e4cfc391fc7390f486196c6435fd5e2d1429738034232ed7a3fe9113280ac1a08433"

RPROVIDES:${PN} += "libtree-sitter-query.so \
tree-sitter-query \
treesitter-grammar-tree-sitter-query"

RDEPENDS:${PN} += ""

inherit rpm
