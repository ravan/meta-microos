SUMMARY = "Devel package for tree-sitter-python containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.6"

RPM_NAME = "tree-sitter-python-devel-0.23.6-3.1.noarch.rpm"
RPM_HASH = "4ba6725b04867950d3e534911789312c8d5c23b1499726765e566d14045ef2dbbceb5343f8a0e7c4aa1982c6ebffd7bde58714b319ab4be5507be7b873069841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-python-devel \
treesitter-grammar-src-tree-sitter-python"

RDEPENDS:${PN} += ""

inherit rpm
