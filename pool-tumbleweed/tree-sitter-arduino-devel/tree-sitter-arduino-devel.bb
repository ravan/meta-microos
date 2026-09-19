SUMMARY = "Devel package for tree-sitter-arduino containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.24.0"

RPM_NAME = "tree-sitter-arduino-devel-0.24.0-2.4.noarch.rpm"
RPM_HASH = "6abf6a7b829f26827033eb1ea9025ba7d32105aa4ee766f060b11e96586c96e4e3a90fa47f1d6f5b4c126723a496b7f3a308a0c18e30190381ab061fb23cdce3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-arduino-devel \
treesitter-grammar-src-tree-sitter-arduino"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-cpp"

inherit rpm
