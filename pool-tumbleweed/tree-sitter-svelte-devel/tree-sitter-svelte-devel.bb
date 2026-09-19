SUMMARY = "Devel package for tree-sitter-svelte containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "tree-sitter-svelte-devel-1.0.2-2.4.noarch.rpm"
RPM_HASH = "7ac8761516960dafbdd14ab745638eb7f91b8711be48f60d2fec1f61108b4f8d687a9140e43bc7c0115960023d3f71936725a0dd8e9a12b0557b302c7eee5b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-svelte-devel \
treesitter-grammar-src-tree-sitter-svelte"

RDEPENDS:${PN} += "treesitter-grammar-src-tree-sitter-html"

inherit rpm
