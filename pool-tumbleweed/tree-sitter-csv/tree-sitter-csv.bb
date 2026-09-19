SUMMARY = "CSV grammar for tree-sitter"
DESCRIPTION = "CSV grammar for tree-sitter."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "tree-sitter-csv-1.2.0-2.4.aarch64.rpm"
RPM_HASH = "15e4635cc871a1f64702405f3eea1205d7d9e458f3c5a1f593612428f6a9317616aab45e23a9690b3a95632f8219ae8ef990f275463d96d569f023a70a05f877"

RPROVIDES:${PN} += "libtree-sitter-csv.so \
libtree-sitter-psv.so \
libtree-sitter-tsv.so \
tree-sitter-csv \
treesitter-grammar-tree-sitter-csv \
treesitter-grammar-tree-sitter-psv \
treesitter-grammar-tree-sitter-tsv"

RDEPENDS:${PN} += ""

inherit rpm
