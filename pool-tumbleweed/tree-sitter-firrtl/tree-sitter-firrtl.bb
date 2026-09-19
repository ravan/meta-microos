SUMMARY = "FIRRTL grammar for tree-sitter"
DESCRIPTION = "FIRRTL grammar for tree-sitter."
LICENSE = "Apache-2.0"

PV = "0+20240420.8503d3a"

RPM_NAME = "tree-sitter-firrtl-0+20240420.8503d3a-2.4.aarch64.rpm"
RPM_HASH = "0786b4c1df7cb38088adbd79a5dd385ffcd4280d69fa4209cfdc2505ea8a2776e73a36d779a6d0dbfcc35b98b39d49daf01a5ebf8c6d34025e943ac4dbc02e41"

RPROVIDES:${PN} += "libtree-sitter-firrtl.so \
tree-sitter-firrtl \
treesitter-grammar-tree-sitter-firrtl"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
