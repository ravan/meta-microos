SUMMARY = "Hyprlang grammar for tree-sitter"
DESCRIPTION = "Hyprlang grammar for tree-sitter."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "tree-sitter-hyprlang-3.1.0-2.4.aarch64.rpm"
RPM_HASH = "7e63cf2adef20436b369845872dff3c2338906f507f6f7f262468f2ae721ac2b7752e1c93624b7a7c8e61416536be7d92a1087feff59fc0e561ec93e3a71be98"

RPROVIDES:${PN} += "libtree-sitter-hyprlang.so \
tree-sitter-hyprlang \
treesitter-grammar-tree-sitter-hyprlang"

RDEPENDS:${PN} += ""

inherit rpm
