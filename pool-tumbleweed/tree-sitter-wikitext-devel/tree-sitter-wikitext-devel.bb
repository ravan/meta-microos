SUMMARY = "Devel package for tree-sitter-wikitext containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "tree-sitter-wikitext-devel-0.1.1-1.3.noarch.rpm"
RPM_HASH = "e5565b7e512caca69419d49c80c5243b36ebaef2b23d6e1a30de7cc3deb8e946d0cab3fb082e4fc4a4bc58bb71dd47f00114fde134158a4ec31741b535a2f319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-wikitext-devel \
treesitter-grammar-src-tree-sitter-wikitext"

RDEPENDS:${PN} += ""

inherit rpm
