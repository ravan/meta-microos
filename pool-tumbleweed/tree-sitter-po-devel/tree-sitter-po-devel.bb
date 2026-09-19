SUMMARY = "Devel package for tree-sitter-po containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20240420.bd860a0"

RPM_NAME = "tree-sitter-po-devel-0+20240420.bd860a0-2.4.noarch.rpm"
RPM_HASH = "c10de040ea059d10e37e6d69e7a76a43489ea81759e7d29991259c9c9b834e4991b68f4c7c5243c7089739fadaba1e1ecec554fb9515f33bc61fe57204ff6f98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-po-devel \
treesitter-grammar-src-tree-sitter-po"

RDEPENDS:${PN} += ""

inherit rpm
