SUMMARY = "Devel package for tree-sitter-puppet containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-puppet-devel-1.3.0-2.4.noarch.rpm"
RPM_HASH = "83693e341f1ec5deb9c9e5a5b065e018692db0fbcd82a603a0c09259ab4937b7add3b247d4a9210a6e12db3a67d10872146a42650eabefdf73b01d9aa2d3070a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-puppet-devel \
treesitter-grammar-src-tree-sitter-puppet"

RDEPENDS:${PN} += ""

inherit rpm
