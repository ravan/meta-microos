SUMMARY = "Luau grammar for tree-sitter"
DESCRIPTION = "Luau grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "tree-sitter-luau-1.2.0-2.3.aarch64.rpm"
RPM_HASH = "a0eb1a61f3b434ddd43ab4bdfc5f9512c471adb098b1f3756366c50b7997401cdebd3792b38e03d01ac02bdfbc5fc679b6a6a885d0bad3b893dfee18f2434a61"

RPROVIDES:${PN} += "libtree-sitter-luau.so \
tree-sitter-luau \
treesitter-grammar-tree-sitter-luau"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
