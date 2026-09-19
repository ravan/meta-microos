SUMMARY = "PoE item filter grammar for tree-sitter"
DESCRIPTION = "PoE item filter grammar for tree-sitter."
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "tree-sitter-poe-filter-0.4.0-2.4.aarch64.rpm"
RPM_HASH = "8d1d455f5b94c03202085eaf53e0174b2b245a44cfe9949497b8ad9e3ae1cc12fdfb5208209646d100366ac35799cd3b47acc3a3b6f9c25acbfd14500aeaa92d"

RPROVIDES:${PN} += "libtree-sitter-poe-filter.so \
tree-sitter-poe-filter \
treesitter-grammar-tree-sitter-poe-filter"

RDEPENDS:${PN} += ""

inherit rpm
