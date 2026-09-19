SUMMARY = "Devel package for tree-sitter-scss containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-scss-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "bd39d14f2f2a336ff35444a9d1d8f1dc6fe3e286ac1a8ee790cdc9aa339fb8e1aa74dd1fb8496dc8964604c9f3fc6b5f91325817592432d6199d371ef4c55136"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-scss-devel \
treesitter-grammar-src-tree-sitter-scss"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-css"

inherit rpm
