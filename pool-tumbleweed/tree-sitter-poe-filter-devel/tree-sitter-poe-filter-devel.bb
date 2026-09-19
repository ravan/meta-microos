SUMMARY = "Devel package for tree-sitter-poe-filter containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "tree-sitter-poe-filter-devel-0.4.0-2.4.noarch.rpm"
RPM_HASH = "2bb34d01de4bb9378337f8fb63638f60208d87c34a70edb3d0ee08bea81505981ac0a4ca96d5e4d4a7a818ba74bb317184cb6dce130fe2d7261d9825ca5429f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-poe-filter-devel \
treesitter-grammar-src-tree-sitter-poe-filter"

RDEPENDS:${PN} += ""

inherit rpm
