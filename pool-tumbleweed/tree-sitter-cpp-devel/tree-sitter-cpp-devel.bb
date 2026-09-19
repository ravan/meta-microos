SUMMARY = "Devel package for tree-sitter-cpp containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "tree-sitter-cpp-devel-0.23.4-3.1.noarch.rpm"
RPM_HASH = "b7b4b92054bcd0d539bbbaa84e1905972928cc523351e6e83e0ca4faad48a6c73b8082b6e646fdfc85d1ef075091f447d9c86620164de411dc9c362f6c27f953"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-cpp-devel \
treesitter-grammar-src-tree-sitter-cpp"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-c"

inherit rpm
