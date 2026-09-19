SUMMARY = "Devel package for tree-sitter-doxygen containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-doxygen-devel-1.1.0-2.4.noarch.rpm"
RPM_HASH = "384427fbe309a02c5a799f7459e688df88df652f96f7219e70e77050695cf2c621820e4799017278a319ceb73faf508663a13faa970751da9ccdd30eb644bf4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-doxygen-devel \
treesitter-grammar-src-tree-sitter-doxygen"

RDEPENDS:${PN} += ""

inherit rpm
