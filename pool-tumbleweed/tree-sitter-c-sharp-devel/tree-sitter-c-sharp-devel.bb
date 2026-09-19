SUMMARY = "Devel package for tree-sitter-c-sharp containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "tree-sitter-c-sharp-devel-0.23.5-2.1.noarch.rpm"
RPM_HASH = "b99584424ad78be5611f545bdbf665fcd85cf13138926e8d6a5e1c901cf116c8daa37471188638c0032fb2fe6ada4363856cd2a5934f1ed7c08942cd5cec6bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-c-sharp-devel \
treesitter-grammar-src-tree-sitter-c-sharp"

RDEPENDS:${PN} += ""

inherit rpm
