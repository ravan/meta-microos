SUMMARY = "Devel package for tree-sitter-objc containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "tree-sitter-objc-devel-3.0.2-1.1.noarch.rpm"
RPM_HASH = "b30ad34d0ca135b771caaecadac66eb31f64aa99cb26da23e1e2ff8defbbb44e1bc2879ab1330b99b42c0661861750e1a5daeca9f6c3ae1f27c46715a95c459a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-objc-devel \
treesitter-grammar-src-tree-sitter-objc"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-c"

inherit rpm
