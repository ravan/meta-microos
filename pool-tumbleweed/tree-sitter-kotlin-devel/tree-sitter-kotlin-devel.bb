SUMMARY = "Devel package for tree-sitter-kotlin containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-kotlin-devel-1.1.0-3.1.noarch.rpm"
RPM_HASH = "6d89a0efd8a0e76665977e887acab0f15358ceb367acc8c333bb1103be996e8dcfa8bd0364144d0c028ad2a4635f9c9b3ad99ffa2ff6ae0043aade6616ca81d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-kotlin-devel \
treesitter-grammar-src-tree-sitter-kotlin"

RDEPENDS:${PN} += ""

inherit rpm
