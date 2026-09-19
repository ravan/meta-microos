SUMMARY = "Devel package for tree-sitter-firrtl containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "Apache-2.0"

PV = "0+20240420.8503d3a"

RPM_NAME = "tree-sitter-firrtl-devel-0+20240420.8503d3a-2.4.noarch.rpm"
RPM_HASH = "6c05b6c72e4c84d7c1601e8ab4b37097bd7cff90d9214537bfb953fe33790c15a287d005a88b1a3bce9059b21f106e71e4ed6fffa5cb0badf23673e9aec0c002"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-firrtl-devel \
treesitter-grammar-src-tree-sitter-firrtl"

RDEPENDS:${PN} += ""

inherit rpm
