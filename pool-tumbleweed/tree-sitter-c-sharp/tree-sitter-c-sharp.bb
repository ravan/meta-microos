SUMMARY = "C# grammar for tree-sitter"
DESCRIPTION = "Python binding for the tree-sitter-c-sharp grammar."
LICENSE = "MIT"

PV = "0.23.5"

RPM_NAME = "tree-sitter-c-sharp-0.23.5-2.1.aarch64.rpm"
RPM_HASH = "9c4aefc5ab36a0b07d0581bb82e7003b453973863c7fc49d5e439b19f18baf12676eb4921896981185b4295fc7847d072e9fa24569d428e030fa9d59da9db53d"

RPROVIDES:${PN} += "libtree-sitter-c-sharp.so \
tree-sitter-c-sharp \
treesitter-grammar-tree-sitter-c-sharp"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
