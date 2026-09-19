SUMMARY = "Devel package for tree-sitter-query containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "Apache-2.0"

PV = "0.8.0"

RPM_NAME = "tree-sitter-query-devel-0.8.0-2.4.noarch.rpm"
RPM_HASH = "0337149be1af0c32d5be61f37a0cbf6ecc1bb10630987543dfc5ce588e4891309b0a6e189e5ccf5bf20a2cd2afad4bc2f1ac3ff9c71ac66b7e5d3f0b906b4499"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-query-devel \
treesitter-grammar-src-tree-sitter-query"

RDEPENDS:${PN} += ""

inherit rpm
