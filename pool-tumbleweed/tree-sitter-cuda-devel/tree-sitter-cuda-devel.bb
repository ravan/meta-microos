SUMMARY = "Devel package for tree-sitter-cuda containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.21.0"

RPM_NAME = "tree-sitter-cuda-devel-0.21.0-2.4.noarch.rpm"
RPM_HASH = "0ab6bc2c0bd62de86ce9b16cb9cc0798015d4205d9c72e13c1163642aaee8687b22850232bc5f71dfa5ef6966cb875943cb79bbff56819f2c277e4f407473471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-cuda-devel \
treesitter-grammar-src-tree-sitter-cuda"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-cpp"

inherit rpm
