SUMMARY = "RPMspec grammar for tree-sitter"
DESCRIPTION = "RPMspec grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "tree-sitter-wikitext-0.1.1-1.3.aarch64.rpm"
RPM_HASH = "ee72f42cf6fe8698008eaeb01bf4d82989eec2fec55537273e019749904e23b7d982ed02a826f97006d28269219250bc2d14a94dc056fab7b490635ff29ea849"

RPROVIDES:${PN} += "libtree-sitter-wikitext.so \
tree-sitter-wikitext \
treesitter-grammar-tree-sitter-wikitext"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
