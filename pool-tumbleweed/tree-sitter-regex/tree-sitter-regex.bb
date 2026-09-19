SUMMARY = "Regex grammar for tree-sitter"
DESCRIPTION = "Regex grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.24.3"

RPM_NAME = "tree-sitter-regex-0.24.3-2.5.aarch64.rpm"
RPM_HASH = "5efb725c3fa2966b2c5f4c538e104ed50d8761654a09f564921b0be78cb46b95045d6eb72b07bd027736bb81e32202ca42571d60ad30126d3bcb7a7d5662c0eb"

RPROVIDES:${PN} += "libtree-sitter-regex.so \
tree-sitter-regex \
treesitter-grammar-tree-sitter-regex"

RDEPENDS:${PN} += ""

inherit rpm
