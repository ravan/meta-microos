SUMMARY = "Devel package for tree-sitter-rust containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "tree-sitter-rust-devel-0.24.0-3.1.noarch.rpm"
RPM_HASH = "964284966c0b7659a4f2f82159759e004503983b542f27a2be9c22a0d99514cc3e1996c8125ef8440f7423a248df9662946ec28e855353dfa53523bb9c8aae6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-rust-devel \
treesitter-grammar-src-tree-sitter-rust"

RDEPENDS:${PN} += ""

inherit rpm
