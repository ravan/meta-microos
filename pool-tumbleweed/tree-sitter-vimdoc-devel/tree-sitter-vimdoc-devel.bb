SUMMARY = "Devel package for tree-sitter-vimdoc containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "tree-sitter-vimdoc-devel-4.1.0-2.4.noarch.rpm"
RPM_HASH = "236aa0700f1525784f504c1791d7f3da591a6e5cdee03333295c4ec8313cef6de18368501e291fad139fcd4f61e2812eeeb2c990906e27ec10e7ba8f12593308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-vimdoc-devel \
treesitter-grammar-src-tree-sitter-vimdoc"

RDEPENDS:${PN} += ""

inherit rpm
