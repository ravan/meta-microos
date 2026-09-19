SUMMARY = "Squirrel grammar for tree-sitter"
DESCRIPTION = "Squirrel grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "tree-sitter-squirrel-1.0.0-2.4.aarch64.rpm"
RPM_HASH = "af0b29d2ab402ecbb6e3e4dfc88a5ec8bb52361c38e1970ae7f35e1479435ef53ba3c5411cac0d1cf654f5e95531ace7e78af04dd53b9b1f88a79d0f70167ca2"

RPROVIDES:${PN} += "libtree-sitter-squirrel.so \
tree-sitter-squirrel \
treesitter-grammar-tree-sitter-squirrel"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
