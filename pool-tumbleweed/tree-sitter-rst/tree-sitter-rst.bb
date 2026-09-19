SUMMARY = "Lua grammar for tree-sitter"
DESCRIPTION = "Lua grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "tree-sitter-rst-0.2.0-2.4.aarch64.rpm"
RPM_HASH = "623c99a99898b0c83b982f7629b335981ea6c18e507793600d173b1ede67d2194ad2e339d816130e76ef1caf679b97c2401b7b53fa5677d136ec47b22213b9bd"

RPROVIDES:${PN} += "libtree-sitter-rst.so \
tree-sitter-rst \
treesitter-grammar-tree-sitter-rst"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
