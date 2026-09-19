SUMMARY = "Devel package for tree-sitter-go containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.23.4"

RPM_NAME = "tree-sitter-go-devel-0.23.4-3.1.noarch.rpm"
RPM_HASH = "a0ab52f879d134ffc47d9c912ce63490b0223a54e40271c8057ead39e9ab335daefbf61fdac03d132f9b0e90e31d8b54ca6d3f628bf12580d18df9f6d1149363"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-go-devel \
treesitter-grammar-src-tree-sitter-go"

RDEPENDS:${PN} += ""

inherit rpm
