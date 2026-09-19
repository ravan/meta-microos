SUMMARY = "Meson grammar for tree-sitter"
DESCRIPTION = "Meson grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-meson-1.3.0-2.4.aarch64.rpm"
RPM_HASH = "4f39d3cf53d0d6ddf7375d35cba1d85ab3f52749ee27e09ecd2ecb6e9643e9cf988a7fc4f5a19f286e8f4dbfb3cc1a7ca73c72fb841c44428bebad85b1c41922"

RPROVIDES:${PN} += "libtree-sitter-meson.so \
tree-sitter-meson \
treesitter-grammar-tree-sitter-meson"

RDEPENDS:${PN} += ""

inherit rpm
