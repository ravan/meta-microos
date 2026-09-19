SUMMARY = "Devel package for tree-sitter-julia containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.1"

RPM_NAME = "tree-sitter-julia-devel-0.23.1-1.1.noarch.rpm"
RPM_HASH = "dbc030a827197790cfa1e91367990b1ffff328a171c3683c02db167940899ec93451e0fab0e5bdd71251f149333676d41c80c62131af114de5950c1427f884b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-julia-devel \
treesitter-grammar-src-tree-sitter-julia"

RDEPENDS:${PN} += ""

inherit rpm
