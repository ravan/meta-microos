SUMMARY = "Xml grammar for tree-sitter"
DESCRIPTION = "Xml grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.7.0+git.1768987141.5000ae8"

RPM_NAME = "tree-sitter-xml-0.7.0+git.1768987141.5000ae8-1.3.aarch64.rpm"
RPM_HASH = "8e46347f6fca71f8d88ba519ca97f3b365c87eb1317886e7f05ca73297b199c7caa30cae0ffaf30fe5e66646230ebef477e2581ac6aee3408ddb335f18cd44f3"

RPROVIDES:${PN} += "libtree-sitter-dtd.so \
libtree-sitter-xml.so \
tree-sitter-xml \
treesitter-grammar-tree-sitter-dtd \
treesitter-grammar-tree-sitter-xml"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
