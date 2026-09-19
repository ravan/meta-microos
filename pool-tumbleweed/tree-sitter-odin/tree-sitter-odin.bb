SUMMARY = "Odin grammar for tree-sitter"
DESCRIPTION = "Odin grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "tree-sitter-odin-1.3.0-2.4.aarch64.rpm"
RPM_HASH = "b90447e1037ea3763cc7abde26c11b46672aa256d31a026372126ad4dd1e27390ec3b6f8e108c788f031ea213b794a9f0a56c12f8c385fa51a694b16b41e69ee"

RPROVIDES:${PN} += "libtree-sitter-odin.so \
tree-sitter-odin \
treesitter-grammar-tree-sitter-odin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
