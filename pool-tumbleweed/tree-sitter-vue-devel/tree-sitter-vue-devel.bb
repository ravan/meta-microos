SUMMARY = "Devel package for tree-sitter-vue containing it's grammar source"
DESCRIPTION = "This package contains grammar sources for use in other grammars."
LICENSE = "MIT"

PV = "0+20260124.ce8011a"

RPM_NAME = "tree-sitter-vue-devel-0+20260124.ce8011a-1.3.noarch.rpm"
RPM_HASH = "9efe604306a2a5fafa8a5e48c82ecfccc31d753c8ab9468da5762e86649c34a8eda20bead412bc2817f70801c4e924b245f0efdea05a9136d74c000745e05851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tree-sitter-vue-devel \
treesitter-grammar-src-tree-sitter-vue"

RDEPENDS:${PN} += ""

inherit rpm
