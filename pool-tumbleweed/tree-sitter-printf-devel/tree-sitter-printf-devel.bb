SUMMARY = "Devel package for tree-sitter-printf containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "ISC"

PV = "0.5.0"

RPM_NAME = "tree-sitter-printf-devel-0.5.0-2.4.noarch.rpm"
RPM_HASH = "532efc16e78eca0affc6a3c01bc3330f281b3dd6682786f7362f477142108485383ac156be728b9b817e0df9992d0d6ca004590876538bc8489c29e3bfcd2d85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-printf-devel \
treesitter-grammar-src-tree-sitter-printf"

RDEPENDS:${PN} += ""

inherit rpm
