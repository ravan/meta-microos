SUMMARY = "Jinja2 grammar for tree-sitter"
DESCRIPTION = "Jinja2 grammar for tree-sitter."
LICENSE = "Apache-2.0"

PV = "0+20240829.31c0292"

RPM_NAME = "tree-sitter-jinja2-0+20240829.31c0292-2.4.aarch64.rpm"
RPM_HASH = "8bdc1566c5d9ad613d4e460f6e7dd98221f23041269addfc3bc07758a707803782a38b0f9987ec8be52fff29ebe0bd46143a6654965002568330b4596a8f2e3d"

RPROVIDES:${PN} += "libtree-sitter-jinja2.so \
tree-sitter-jinja2 \
treesitter-grammar-tree-sitter-jinja2"

RDEPENDS:${PN} += ""

inherit rpm
