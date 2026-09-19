SUMMARY = "Devel package for tree-sitter-go-sum containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-go-sum-devel-1.0.0-2.4.noarch.rpm"
RPM_HASH = "5246d3fd325917de976e151b982a31a6566ef52ffa3193e5c507267d511db0b0b92ca53476bd88b8f6e97b024372582b9507c90d5eb032f404eb25db6f98b8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-go-sum-devel \
treesitter-grammar-src-tree-sitter-go-sum"

RDEPENDS:${PN} += ""

inherit rpm
