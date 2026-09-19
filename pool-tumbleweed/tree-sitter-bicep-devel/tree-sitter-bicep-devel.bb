SUMMARY = "Devel package for tree-sitter-bicep containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-bicep-devel-1.1.0-2.4.noarch.rpm"
RPM_HASH = "13eba753635b2274ecd926be06dd7729509b57377f9acb13aa502be07aa691b0a5ff6a3e24ecb4ad16f94e86e265afeb957e2c340cb37e3e37fb26595c34c5fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-bicep-devel \
treesitter-grammar-src-tree-sitter-bicep"

RDEPENDS:${PN} += ""

inherit rpm
