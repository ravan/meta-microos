SUMMARY = "Typescript grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-typescript grammar."
LICENSE = "MIT"

PV = "0.23.2"

RPM_NAME = "tree-sitter-typescript-0.23.2-3.1.aarch64.rpm"
RPM_HASH = "87a910cdb9018e0946776054e49ec70df768642895562abf339cc8fdc3d711ab9d0843390b87e7bc5e91074fe78667533669862a39c20a5a73dfe75f3dd037e4"

RPROVIDES:${PN} += "libtree-sitter-tsx.so \
libtree-sitter-typescript.so \
tree-sitter-typescript \
treesitter-grammar-tree-sitter-tsx \
treesitter-grammar-tree-sitter-typescript"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
