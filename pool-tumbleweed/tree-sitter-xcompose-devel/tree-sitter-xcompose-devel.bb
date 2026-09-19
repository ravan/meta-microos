SUMMARY = "Devel package for tree-sitter-xcompose containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "tree-sitter-xcompose-devel-0.3.0-2.4.noarch.rpm"
RPM_HASH = "e91f09a3d885cecb0b34562a2f96f00729f7779b54ef67fd14e914bdfcdbff54b9347a34c4212786206c3e4c45ba62a53ec2062940b54aa7fb223930435a24df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-xcompose-devel \
treesitter-grammar-src-tree-sitter-xcompose"

RDEPENDS:${PN} += ""

inherit rpm
