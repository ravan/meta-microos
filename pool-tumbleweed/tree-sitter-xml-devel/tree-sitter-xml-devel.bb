SUMMARY = "Devel package for tree-sitter-xml containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.7.0+git.1768987141.5000ae8"

RPM_NAME = "tree-sitter-xml-devel-0.7.0+git.1768987141.5000ae8-1.3.noarch.rpm"
RPM_HASH = "db0e08413021b714d7172e19551d1dd26c2598018c7033805596ce07a13c65f1048af7ac60672626046ad89ebd9fd64a68f752c03e7a7dd273bf4e1d5c12e636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-xml-devel \
treesitter-grammar-src-tree-sitter-xml"

RDEPENDS:${PN} += ""

inherit rpm
