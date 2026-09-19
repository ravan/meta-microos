SUMMARY = "Devel package for tree-sitter-groovy containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "tree-sitter-groovy-devel-0.1.2-1.1.noarch.rpm"
RPM_HASH = "f8ee5fed20f6944a55b8db380a7a374a548dfdd6df98abac6202c6acea61f98d1f9a10f346d932712a0b8dfb64a34a769465674f51a53b4a4fc93df1ff707f68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-groovy-devel \
treesitter-grammar-src-tree-sitter-groovy"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-java"

inherit rpm
