SUMMARY = "Devel package for tree-sitter-css containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "tree-sitter-css-devel-0.23.2-2.5.noarch.rpm"
RPM_HASH = "dc4420c275d092c8cc322744c3ee22f258ea07c4b757510bddf5e41adb727f6b20d28326f38260a78c2262aa56c8cab4e101761b40da67af6104224843b81617"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-css-devel \
treesitter-grammar-src-tree-sitter-css"

RDEPENDS:${PN} += ""

inherit rpm
