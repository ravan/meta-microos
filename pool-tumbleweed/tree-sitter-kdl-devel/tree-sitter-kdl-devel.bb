SUMMARY = "Devel package for tree-sitter-kdl containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "tree-sitter-kdl-devel-1.1.0-2.4.noarch.rpm"
RPM_HASH = "50d511e8d376749c9ae6429dbbd110f78db5cc4dc89ad83f548cf63bdb470074ca070438797afbcbb6a78399b597e0615808c7990989ecb98fe39554a132de86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-kdl-devel \
treesitter-grammar-src-tree-sitter-kdl"

RDEPENDS:${PN} += ""

inherit rpm
