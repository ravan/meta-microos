SUMMARY = "Uxntal grammar for tree-sitter"
DESCRIPTION = "Uxntal grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-uxntal-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "2fcfa3c5dfae71d940678481f50fe5b3efbd849793c61b9f225ebb50cc99ecda81063c43f2e5067ca69ae0bc9e158c5e44c6d077b37175c692ef0dc3bcae0df8"

RPROVIDES:${PN} += "libtree-sitter-uxntal.so \
tree-sitter-uxntal \
treesitter-grammar-tree-sitter-uxntal"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
