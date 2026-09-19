SUMMARY = "Devel package for tree-sitter-readline containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "tree-sitter-readline-devel-1.1.1-2.4.noarch.rpm"
RPM_HASH = "b8f92779fb3c268812c644cd718252f35fcb97623631cd2ad9a97edfc5e4031b5c1538268d167ac2b182943d39fd77ff53b758173554bdeb52efb9c90e63b94b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-readline-devel \
treesitter-grammar-src-tree-sitter-readline"

RDEPENDS:${PN} += ""

inherit rpm
