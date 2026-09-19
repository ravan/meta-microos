SUMMARY = "Devel package for tree-sitter-luadoc containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-luadoc-devel-1.1.0-2.4.noarch.rpm"
RPM_HASH = "7654dab3022a23b0de54ff65e04824d2f086b0253fdae739cc6a554147e82531949eb1233e5679d95d32d06cbc34425a0f3ce8ab64206597798c6c705a4b67ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-luadoc-devel \
treesitter-grammar-src-tree-sitter-luadoc"

RDEPENDS:${PN} += ""

inherit rpm
