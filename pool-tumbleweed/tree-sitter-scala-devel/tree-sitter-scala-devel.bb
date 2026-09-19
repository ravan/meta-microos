SUMMARY = "Devel package for tree-sitter-scala containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.26.0"

RPM_NAME = "tree-sitter-scala-devel-0.26.0-1.1.noarch.rpm"
RPM_HASH = "85d3fc8ab98e4c9f7be9100ef1a2a8f83d2d24cea0649be60f950e1ff4cfa2b1f82d3305fb53b355d95b93e0159aef24f37d2a80cf2fd526b13d35acc0f9b894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-scala-devel \
treesitter-grammar-src-tree-sitter-scala"

RDEPENDS:${PN} += ""

inherit rpm
