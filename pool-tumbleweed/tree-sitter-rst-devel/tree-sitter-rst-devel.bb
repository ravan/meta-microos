SUMMARY = "Devel package for tree-sitter-rst containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-rst-devel-0.2.0-2.4.noarch.rpm"
RPM_HASH = "e9a0fa9671b4d0c50d396a62f5b9a82659aa293bbb8139a15e744548ebfee9e88869a8ef81ac772350aa47c38278e068824636e69e5c983b1fd42fc6254664d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-rst-devel \
treesitter-grammar-src-tree-sitter-rst"

RDEPENDS:${PN} += ""

inherit rpm
